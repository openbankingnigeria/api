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
    private String street;
    private String city ;
    private String State ;
    private double latitude ;
    private double longitude ;
    private String phoneNumber;
    private List<AgencyServiceType> agencyServices;
   
}
