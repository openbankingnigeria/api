package com.openbanking.api.ng.bank.service;

import java.util.List;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.payload.account.Account;
import com.openbanking.api.ng.payload.account.AccountBlock;
import com.openbanking.api.ng.payload.account.AccountType;
import com.openbanking.api.ng.payload.customer.PocessingOperationResponse;
import com.openbanking.api.ng.payload.directdebit.DirectDebit;
import com.openbanking.api.ng.payload.directdebit.DirectDebitCancelRequest;
import com.openbanking.api.ng.payload.directdebit.DirectDebitSetup;
import com.openbanking.api.ng.payload.limit.Limit;
import com.openbanking.api.ng.payload.limit.LimitCustomer;
import com.openbanking.api.ng.payload.transaction.GetStatement;
import com.openbanking.api.ng.payload.transaction.GetStatementOutput;
import com.openbanking.api.ng.payload.transaction.MultipleTransfer;
import com.openbanking.api.ng.payload.transaction.MultipleTransferBank;
import com.openbanking.api.ng.payload.transaction.PlaceHold;
import com.openbanking.api.ng.payload.transaction.SingleTransfer;
import com.openbanking.api.ng.payload.transaction.SingleTransferBank;

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