package com.openbanking.api.ng.bank.service;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.payload.customer.Customer;
import com.openbanking.api.ng.payload.customer.PocessingOperationResponse;

public interface CustomerInfoService {

	Customer getByCustomerId(String customerId) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	Customer getByPhoneNumber(String phoneNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	Customer getByEmail(String email) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	Customer getByBVN(String bvn) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	PocessingOperationResponse block(String customerId) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	

}
