package ng.openbanking.api.payload.agency;
import java.util.List;

import ng.openbanking.api.payload.definition.AgencyServiceType;
import ng.openbanking.api.payload.definition.AgencyType;

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
