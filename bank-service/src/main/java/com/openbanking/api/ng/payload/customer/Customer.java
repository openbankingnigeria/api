package com.openbanking.api.ng.payload.customer;

import java.util.Date;

import com.openbanking.api.ng.definition.CustomerStatus;
import com.openbanking.api.ng.definition.CustomerType;

import lombok.Data;

@Data
public class Customer {

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
