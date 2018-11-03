package com.openbanking.api.ng.payload.branch;
import com.openbanking.api.ng.definition.BranchType;
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
    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public BranchType getBranchtype() {
        return branchtype;
    }

    public void setBranchtype(BranchType branchtype) {
        this.branchtype = branchtype;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumberOfATMs() {
        return numberOfATMs;
    }

    public void setNumberOfATMs(int numberOfATMs) {
        this.numberOfATMs = numberOfATMs;
    }


}
