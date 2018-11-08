package com.openbanking.api.ng.bank.service;

import java.util.List;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.payload.billpayment.BillPaymentItem;
import com.openbanking.api.ng.payload.billpayment.Biller;
import com.openbanking.api.ng.payload.billpayment.BillerCategory;
import com.openbanking.api.ng.payload.billpayment.BillingSystem;

public interface BillerInfoService {

	List<BillerCategory> getBillerCategories() throws ServiceOperationNotSupported;

	List<BillingSystem> getBillingSystems()  throws ServiceOperationNotSupported;

	List<Biller> getBillersByCategoryId(String categoryId)throws BankResourceNotFoundException,ServiceOperationNotSupported;

	List<BillPaymentItem> getBillPaymentItemByBillerId(String billerId) throws BankResourceNotFoundException,ServiceOperationNotSupported;
}
