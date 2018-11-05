package com.openbanking.api.ng.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.definition.ProcessState;
import com.openbanking.api.ng.payload.customer.Customer;
import com.openbanking.api.ng.payload.customer.PocessingOperationResponse;

@Service
public class SandBoxCustomerInfoService implements CustomerInfoService {

	private static final String CUSTOMER_MODEL_FILE_NAME = "Customer";
	
	
	@Autowired
	private DataService dataService;

	@Override
	public Customer getByCustomerId(String customerId)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getSingleFromList(CUSTOMER_MODEL_FILE_NAME);
	}

	@Override
	public Customer getByPhoneNumber(String phoneNumber)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getSingleFromList(CUSTOMER_MODEL_FILE_NAME);
	}

	@Override
	public Customer getByEmail(String email) throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getSingleFromList(CUSTOMER_MODEL_FILE_NAME);
	}

	@Override
	public Customer getByBVN(String bvn) throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getSingleFromList(CUSTOMER_MODEL_FILE_NAME);
	}

	@Override
	public PocessingOperationResponse block(String customerId)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		PocessingOperationResponse response=new PocessingOperationResponse();
		response.setProcessState(ProcessState.SUBMITTED);
		return response;
	}

	
	
}
