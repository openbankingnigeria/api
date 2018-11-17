package ng.openbanking.api.payload.bank.service;

import java.util.List;

import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.customer.PocessingOperationResponse;
import ng.openbanking.api.payload.transaction.GetStatement;
import ng.openbanking.api.payload.transaction.GetStatementOutput;
import ng.openbanking.api.payload.transaction.MultipleTransfer;
import ng.openbanking.api.payload.transaction.MultipleTransferBank;
import ng.openbanking.api.payload.transaction.PlaceHold;
import ng.openbanking.api.payload.transaction.SingleTransfer;
import ng.openbanking.api.payload.transaction.SingleTransferBank;

public interface BankTransactionService {

	PocessingOperationResponse singleTransferWithinBank(SingleTransferBank singleTransferBank) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	PocessingOperationResponse singleTransferOtherBank(SingleTransferBank singleTransferBank) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	PocessingOperationResponse singleTransferToEmail(String email, SingleTransfer singleTransfer);

	PocessingOperationResponse singleTransferToPhone(String phone, SingleTransfer singleTransfer);

	PocessingOperationResponse multipleTransferWithinBank(MultipleTransferBank multipleTransferBank);

	PocessingOperationResponse multipleTransferOtherBank(MultipleTransferBank multipleTransferBank);

	PocessingOperationResponse multipleTransferToPhone(MultipleTransfer multipleTransfer);

	PocessingOperationResponse multipleTransferToEmail(MultipleTransfer multipleTransfer);

	PocessingOperationResponse placeHold(PlaceHold placeHold);

	PocessingOperationResponse getHold(String accountNumber, String holdReferenceId);

	PocessingOperationResponse removeHold(String accountNumber, String holdReferenceId);

	PocessingOperationResponse placePnd(String accountNumber, String pndReferenceId, String amount, String reason);

	List<GetStatementOutput> getStatement(GetStatement getStatement);
}