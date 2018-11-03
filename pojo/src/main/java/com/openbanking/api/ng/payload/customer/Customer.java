package com.openbanking.api.ng.payload.customer;

import java.util.Date;

import com.openbanking.api.ng.definition.CustomerStatus;
import com.openbanking.api.ng.definition.CustomerType;

import lombok.Data;

@Data
public class Customer {

    private String customerID = "1";

    private String firstName = "Sodiq";

    private String lastName = "Fagbola";

    private String otherNames = "Damilare";

    private String bvn = "8272918279";

    private String email = "sodiq@openbanking.com";

    private int numberOfAccounts = 1;

    private CustomerType type = CustomerType.CORPORATE;

    private Date startDateOfRelationship;

    private CustomerStatus status = CustomerStatus.ACTIVE;

    private String address = "Lagos, Nigeria";

   
}
