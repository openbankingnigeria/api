package com.openbanking.api.ng.payload.branch;
import com.openbanking.api.ng.definition.BranchType;

import lombok.Data;
@Data
public class Branch {

   private String  branchId ;
   private String branchName ;
   private BranchType branchtype ;
   private String street ;
   private String city ;
   private String state ;
   private double longitude;
   private double latitude ;
   private String phoneNumber;
   private int numberOfATMs;
   
}
