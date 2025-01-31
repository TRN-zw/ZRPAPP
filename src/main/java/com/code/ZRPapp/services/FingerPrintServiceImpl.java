package com.code.ZRPapp.services;

import com.code.ZRPapp.models.FingerPrintForm;
import com.code.ZRPapp.repository.FingerPrintRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FingerPrintServiceImpl implements FingerPrintService {

    @Autowired
    FingerPrintRepositiry fingerPrintRepositiry;

    @Override
    public List<FingerPrintForm> getFormList() {
        return fingerPrintRepositiry.findAll();
    }

    @Override
    public FingerPrintForm saveForm(FingerPrintForm fingerPrintForm) {
        FingerPrintForm fingerPrintForm1= FingerPrintForm.builder()
                .id(fingerPrintForm.getId())
                .additionalDocumentsOfIdentity(fingerPrintForm.getAdditionalDocumentsOfIdentity())
                .alias(fingerPrintForm.getAlias())
                .countryOfOrigin(fingerPrintForm.getCountryOfOrigin())
                .dateAndPlaceOfBirth(fingerPrintForm.getDateAndPlaceOfBirth())
                .dateOfIssue(fingerPrintForm.getDateOfIssue())
                .dateOfPassIssue(fingerPrintForm.getDateOfPassIssue())
                .district(fingerPrintForm.getDistrict())
                .districtOfOrigin(fingerPrintForm.getDistrictOfOrigin())
                .fullName(fingerPrintForm.getFullName())
                .height(fingerPrintForm.getHeight())
                .nicNumber(fingerPrintForm.getNicNumber())
                .officeOfIssue(fingerPrintForm.getOfficeOfIssue())
                .race(fingerPrintForm.getRace())
                .sex(fingerPrintForm.getSex())
                .reasonForSearch(fingerPrintForm.getReasonForSearch())
                .passportNoAndCountryOfOrigin(fingerPrintForm.getPassportNoAndCountryOfOrigin())
                .registeredNumber(fingerPrintForm.getRegisteredNumber())
                .visibleIdentifyingMarksOfDeformities(fingerPrintForm.getVisibleIdentifyingMarksOfDeformities())
                .build();

        return fingerPrintRepositiry.save(fingerPrintForm);
    }

    @Override
    public FingerPrintForm getForm(int id) {
        return null;
    }

    @Override
    public void deleteForm(int id) {

    }
}
