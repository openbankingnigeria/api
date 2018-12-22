package ng.openbanking.api.payload.customer;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;
import ng.openbanking.api.payload.definition.CustomerStatus;
import ng.openbanking.api.payload.definition.CustomerType;

import java.util.Date;

@Data
public class Customer  extends BasePayload {

    private String customerID;

    private String firstName;

    private String lastName ;

    private String otherNames;

    private String bvn;

    private String email;

    private int numberOfAccounts;

    private CustomerType type;

    private Date startDateOfRelationship;

    private CustomerStatus status;

    private String address;

   
}
