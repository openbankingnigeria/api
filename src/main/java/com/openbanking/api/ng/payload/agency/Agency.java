package com.openbanking.api.ng.payload.agency;
import com.openbanking.api.ng.definition.AgencyType;
import com.openbanking.api.ng.definition.AgencyServiceType;
import java.util.List;
public class Agency {
    private String agencyID;
    private String agencyName;
    private AgencyType agencyType;
    private String street;
    private String city;
    private String State;
    private int latitude;
    private int longitude;
    private String phoneNumber;
    private List<AgencyServiceType> agencyServices;
    public String getAgencyID() {
        return agencyID;
    }

    public void setAgencyID(String agencyID) {
        this.agencyID = agencyID;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public AgencyType getAgencyType() {
        return agencyType;
    }

    public void setAgencyType(AgencyType agencyType) {
        this.agencyType = agencyType;
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
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<AgencyServiceType> getAgencyServices() {
        return agencyServices;
    }

    public void setAgencyServices(List<AgencyServiceType> agencyServices) {
        this.agencyServices = agencyServices;
    }
}
