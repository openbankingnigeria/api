package ng.openbanking.api.demo.service;

import java.util.List;

import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.bank.service.BankTransactionService;
import ng.openbanking.api.payload.customer.PocessingOperationResponse;
import ng.openbanking.api.payload.definition.OperationStatus;
import ng.openbanking.api.payload.transaction.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DemoTransactionService implements BankTransactionService {

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
