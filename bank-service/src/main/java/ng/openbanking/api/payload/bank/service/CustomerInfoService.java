package ng.openbanking.api.payload.bank.service;

import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.customer.Customer;
import ng.openbanking.api.payload.customer.PocessingOperationResponse;

public interface CustomerInfoService {

	Customer getByCustomerId(String customerId) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	Customer getByPhoneNumber(String phoneNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	Customer getByEmail(String email) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	Customer getByBVN(String bvn) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	PocessingOperationResponse block(String customerId) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	

}
