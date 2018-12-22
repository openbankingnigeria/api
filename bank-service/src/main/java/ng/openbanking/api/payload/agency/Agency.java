package ng.openbanking.api.payload.agency;
import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;
import ng.openbanking.api.payload.definition.AgencyServiceType;
import ng.openbanking.api.payload.definition.AgencyType;

import java.util.List;
@Data
public class Agency  extends BasePayload {
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
