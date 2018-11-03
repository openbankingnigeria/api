package com.openbanking.api.ng.payload.agency;
import java.util.List;

import com.openbanking.api.ng.definition.AgencyServiceType;
import com.openbanking.api.ng.definition.AgencyType;

import lombok.Data;
@Data
public class Agency {
    private String agencyID;
    private String agencyName;
    private AgencyType agencyType;
    private String street = "Adegbola Street";
    private String city = "Ikoyi";
    private String State = "Lagos";
    private double latitude = 35;
    private double longitude = 76;
    private String phoneNumber = "090000000";
    private List<AgencyServiceType> agencyServices;
   
}
