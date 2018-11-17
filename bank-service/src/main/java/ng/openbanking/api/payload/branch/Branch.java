package ng.openbanking.api.payload.branch;
import ng.openbanking.api.payload.definition.BranchType;

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
