package com.openbanking.api.ng.payload.branch;
import com.openbanking.api.ng.definition.BranchType;

import lombok.Data;
@Data
public class Branch {

   private String  branchId = "1";
   private String branchName = "Ikoyi Branch";
   private BranchType branchtype ;
   private String street = "Adegbola Street";
   private String city = "Ikoyi";
   private String state = "Lagos";
   private double longitude = 65;
   private double latitude = 98;
   private String phoneNumber = "09000000000";
   private int numberOfATMs = 34;
   
}
