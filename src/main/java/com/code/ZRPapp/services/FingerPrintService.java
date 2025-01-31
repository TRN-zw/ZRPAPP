package com.code.ZRPapp.services;

import com.code.ZRPapp.models.FingerPrintForm;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FingerPrintService {
    List<FingerPrintForm> getFormList();
    FingerPrintForm saveForm(FingerPrintForm fingerPrintForm);
    FingerPrintForm getForm(int id);
    void deleteForm(int id);
}
