package com.code.ZRPapp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "fingerprintform")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FingerPrintForm implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String fullName;
    @Column
    private String alias;
    @Column
    private String sex;
    @Column
    private String race;
    @Column
    private String registeredNumber;
    @Column
    private String officeOfIssue;
    @Column
    private LocalDate dateOfIssue;
    @Column
    private String reasonForSearch;
    @Column
    private String nicNumber;
    @Column
    private String district;
    @Column
    private String additionalDocumentsOfIdentity;
    @Column
    private String districtOfOrigin;
    @Column
    private String countryOfOrigin;
    @Column
    private String dateAndPlaceOfBirth;
    @Column
    private double height;
    @Column
    private String visibleIdentifyingMarksOfDeformities;
    @Column
    private String passportNoAndCountryOfOrigin;
    @Column
    private LocalDate dateOfPassIssue;

}
