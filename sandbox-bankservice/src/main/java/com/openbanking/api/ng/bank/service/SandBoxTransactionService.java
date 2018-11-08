package com.openbanking.api.ng.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.customer.PocessingOperationResponse;
import com.openbanking.api.ng.payload.transaction.GetStatement;
import com.openbanking.api.ng.payload.transaction.GetStatementOutput;
import com.openbanking.api.ng.payload.transaction.MultipleTransfer;
import com.openbanking.api.ng.payload.transaction.MultipleTransferBank;
import com.openbanking.api.ng.payload.transaction.PlaceHold;
import com.openbanking.api.ng.payload.transaction.SingleTransfer;
import com.openbanking.api.ng.payload.transaction.SingleTransferBank;

@Service
public class SandBoxTransactionService implements BankTransactionService {

	@Autowired
	private DataService dataService;
	
	private static final String STATEMENT_MODEL_FILE_NAME = "statement";
	
	@Override
	public PocessingOperationResponse singleTransferWithinBank(SingleTransferBank singleTransferBank)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}

	@Override
	public PocessingOperationResponse singleTransferOtherBank(SingleTransferBank singleTransferBank)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}

	@Override
	public PocessingOperationResponse singleTransferToEmail(String email, SingleTransfer singleTransfer) {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
		
	}

	@Override
	public PocessingOperationResponse singleTransferToPhone(String phone, SingleTransfer singleTransfer) {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}

	@Override
	public PocessingOperationResponse multipleTransferWithinBank(MultipleTransferBank multipleTransferBank) {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}

	@Override
	public PocessingOperationResponse multipleTransferOtherBank(MultipleTransferBank multipleTransferBank) {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}

	@Override
	public PocessingOperationResponse multipleTransferToPhone(MultipleTransfer multipleTransfer) {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}

	@Override
	public PocessingOperationResponse multipleTransferToEmail(MultipleTransfer multipleTransfer) {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}

	@Override
	public PocessingOperationResponse placeHold(PlaceHold placeHold) {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}

	@Override
	public PocessingOperationResponse getHold(String accountNumber, String holdReferenceId) {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}

	@Override
	public PocessingOperationResponse removeHold(String accountNumber, String holdReferenceId) {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}

	@Override
	public PocessingOperationResponse placePnd(String accountNumber, String pndReferenceId, String amount,
			String reason) {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}

	@Override
	public List<GetStatementOutput> getStatement(GetStatement getStatement) {
		return dataService.getModelList(STATEMENT_MODEL_FILE_NAME);
	}

}
