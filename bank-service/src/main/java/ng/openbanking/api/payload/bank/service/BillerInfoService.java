package ng.openbanking.api.payload.bank.service;

import java.util.List;

import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.billpayment.BillPaymentItem;
import ng.openbanking.api.payload.billpayment.Biller;
import ng.openbanking.api.payload.billpayment.BillerCategory;
import ng.openbanking.api.payload.billpayment.BillingSystem;

public interface BillerInfoService {

	List<BillerCategory> getBillerCategories() throws ServiceOperationNotSupported;

	List<BillingSystem> getBillingSystems()  throws ServiceOperationNotSupported;

	List<Biller> getBillersByCategoryId(String categoryId)throws BankResourceNotFoundException,ServiceOperationNotSupported;

	List<BillPaymentItem> getBillPaymentItemByBillerId(String billerId) throws BankResourceNotFoundException,ServiceOperationNotSupported;
}
