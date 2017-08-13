package com.openbanking.api.ng.payload.customer;

import com.openbanking.api.ng.definition.CustomerStatus;
import com.openbanking.api.ng.definition.CustomerType;

import java.util.Date;

public class Customer {

    private String customerID;

    private String firstName;

    private String lastName;

    private String otherNames;

    private String bvn;

    private String email;

    private int numberOfAccounts;

    private CustomerType type;

    private Date startDateOfRelationship;

    private CustomerStatus status;

    private String address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public String getBvn() {
        return bvn;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setNumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    public Date getStartDateOfRelationship() {
        return startDateOfRelationship;
    }

    public void setStartDateOfRelationship(Date startDateOfRelationship) {
        this.startDateOfRelationship = startDateOfRelationship;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
