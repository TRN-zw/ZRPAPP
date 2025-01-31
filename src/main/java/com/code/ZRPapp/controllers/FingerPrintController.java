package com.code.ZRPapp.controllers;

import com.code.ZRPapp.models.FingerPrintForm;
import com.code.ZRPapp.services.FingerPrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FingerPrintController {
    @Autowired
    FingerPrintService fingerPrintService;
     @GetMapping("/regForm")
    public ModelAndView formReg(){
        ModelAndView mv = new ModelAndView("formPrint");
        mv.addObject("fpform", new FingerPrintForm());
        return mv;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)// @PostMapping("/regForm")
    public ResponseEntity<FingerPrintFormDto> createForm(@ModelAttribute("fingerPrintForm") FingerPrintForm fingerPrintForm ){
        FingerPrintForm fingerPrintForm1 = fingerPrintService.saveForm(fingerPrintForm);
        return ResponseEntity.ok(FingerPrintFormDto.constructFingerPrintForm(fingerPrintForm));
    }

    @GetMapping("/display")
    public ModelAndView display(){
        ModelAndView mv = new ModelAndView("displayForm");
        List<FingerPrintForm> fingerPrintFormList = fingerPrintService.getFormList();
        mv.addObject("formList", fingerPrintFormList);
        return mv;
    }
}
