package com.openbanking.api.ng.bank.service;

import java.util.List;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.payload.agency.Agency;
import com.openbanking.api.ng.payload.atm.ATM;
import com.openbanking.api.ng.payload.branch.Branch;
import com.openbanking.api.ng.payload.general.BankMeta;
import com.openbanking.api.ng.payload.general.GeneralCharges;
import com.openbanking.api.ng.payload.general.GeneralGetProduct;
import com.openbanking.api.ng.payload.general.GeneralInterfaceVersion;
import com.openbanking.api.ng.payload.pos.POS;

public interface GeneralInfoService {

	GeneralInterfaceVersion getInterfaceVersion() throws  ServiceOperationNotSupported ;

	BankMeta getBankMeta() throws  ServiceOperationNotSupported ;

	List<GeneralCharges> getCharges() throws  ServiceOperationNotSupported ;

	List<GeneralGetProduct> getProducts() throws  ServiceOperationNotSupported ;

	

}
