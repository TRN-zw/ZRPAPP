package com.code.ZRPapp.controllers;

import com.code.ZRPapp.models.FingerPrintForm;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Data
@AllArgsConstructor
public class FingerPrintFormDto {

    private Long id;
    private String fullName;
    private String alias;
    private String sex;
    private String race;
    private String registeredNumber;
    private String officeOfIssue;
    private LocalDate dateOfIssue;
    private String reasonForSearch;
    private String nicNumber;
    private String district;
    private String additionalDocumentsOfIdentity;
    private String districtOfOrigin;
    private String countryOfOrigin;
    private String dateAndPlaceOfBirth;
    private double height;
    private String visibleIdentifyingMarksOfDeformities;
    private String passportNoAndCountryOfOrigin;
    private LocalDate dateOfPassIssue;

    public static FingerPrintFormDto constructFingerPrintForm(FingerPrintForm fingerPrintForm){
        if (Objects.isNull(fingerPrintForm))
            return null;

        return new FingerPrintFormDto(fingerPrintForm.getId(), fingerPrintForm.getFullName(),fingerPrintForm.getAlias(),fingerPrintForm.getSex(),
                fingerPrintForm.getRace(),fingerPrintForm.getRegisteredNumber(),fingerPrintForm.getOfficeOfIssue(),fingerPrintForm.getDateOfIssue(),fingerPrintForm.getReasonForSearch(),fingerPrintForm.getNicNumber(),
                fingerPrintForm.getDistrict(),fingerPrintForm.getAdditionalDocumentsOfIdentity(),fingerPrintForm.getDistrictOfOrigin(),fingerPrintForm.getCountryOfOrigin(),fingerPrintForm.getDateAndPlaceOfBirth(),
                fingerPrintForm.getHeight(),fingerPrintForm.getVisibleIdentifyingMarksOfDeformities(),fingerPrintForm.getPassportNoAndCountryOfOrigin(),fingerPrintForm.getDateOfPassIssue());
    }
}
