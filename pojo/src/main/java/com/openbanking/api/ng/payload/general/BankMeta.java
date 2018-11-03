package com.openbanking.api.ng.payload.general;
import com.openbanking.api.ng.definition.BankCategory;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.ErrorResponse;

import lombok.Data;

@Data
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

    private String socialMediaTypeAndAddress;
}
