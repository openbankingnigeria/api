package com.openbanking.api.ng.payload.general;
import com.openbanking.api.ng.definition.BankCategory;

public class BankMeta {
    private String bankName = "ABC Bank";
    private String headOfficeAddress = "No 32, ACB Street";
    private String swiftCode = "011";
    private String nibssCode = "012";
    private String cbnBankCode = "013";
    private String numberOfBranches = "300";
    private String numberOfCountryCode;
    private String Rc;
    private String incorporationDate;
    private String customerSupportPhone = "090000000000";
    private String customerSupportEmail = "info@abc.ng";
    private String website = "www.abc.ng";
    private BankCategory bankCategory = BankCategory.COMMERCIAL;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public String getNibssCode() {
        return nibssCode;
    }

    public void setNibssCode(String nibssCode) {
        this.nibssCode = nibssCode;
    }

    public String getCbnBankCode() {
        return cbnBankCode;
    }

    public void setCbnBankCode(String cbnBankCode) {
        this.cbnBankCode = cbnBankCode;
    }

    public String getNumberOfBranches() {
        return numberOfBranches;
    }

    public void setNumberOfBranches(String numberOfBranches) {
        this.numberOfBranches = numberOfBranches;
    }

    public String getNumberOfCountryCode() {
        return numberOfCountryCode;
    }

    public void setNumberOfCountryCode(String numberOfCountryCode) {
        this.numberOfCountryCode = numberOfCountryCode;
    }

    public String getRc() {
        return Rc;
    }

    public void setRc(String rc) {
        Rc = rc;
    }

    public String getIncorporationDate() {
        return incorporationDate;
    }

    public void setIncorporationDate(String incorporationDate) {
        this.incorporationDate = incorporationDate;
    }

    public String getCustomerSupportPhone() {
        return customerSupportPhone;
    }

    public void setCustomerSupportPhone(String customerSupportPhone) {
        this.customerSupportPhone = customerSupportPhone;
    }

    public String getCustomerSupportEmail() {
        return customerSupportEmail;
    }

    public void setCustomerSupportEmail(String customerSupportEmail) {
        this.customerSupportEmail = customerSupportEmail;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public BankCategory getBankCategory() {
        return bankCategory;
    }

    public void setBankCategory(BankCategory bankCategory) {
        this.bankCategory = bankCategory;
    }

    public String getSocialMediaTypeAndAddress() {
        return socialMediaTypeAndAddress;
    }

    public void setSocialMediaTypeAndAddress(String socialMediaTypeAndAddress) {
        this.socialMediaTypeAndAddress = socialMediaTypeAndAddress;
    }

    private String socialMediaTypeAndAddress;
}
