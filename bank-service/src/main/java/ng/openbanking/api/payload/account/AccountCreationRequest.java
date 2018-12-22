package ng.openbanking.api.payload.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

import java.util.Date;

@Data
public class AccountCreationRequest  extends BasePayload {
    private String customerId = "1";
    private String accountName = "Sodiq Fagbola";
    private String firstName = "Sodiq";
    private String surName = "Fagbola";
    private String otherName = "Damilare";
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dateOfBirth = new Date();
    private String bvn  = "0123456789";
    private String phone = "0900000000";
    private String email = "sodiq@openbanking.com";
    private String address = "Lagos, Nigeria";
    private String city = "Lagos";
    private String localGovernment = "Ikoyi";
    private String country = "Nigeria";
    private String nationality = "Nigerian";
    private String accountTypeId = "1";
    private String nextOfKinName = "Ajoke Fagbola";
    private String nextOfKinPhone = "0900000000";
    private String nextOfKinEmail = "ajoke@openbanking.com";
    private String nextOfKinAddress = "Lagos, Nigeria";
    private String nextOfKinRelationship = "Wife";

   
}
