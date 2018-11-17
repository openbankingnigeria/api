package ng.openbanking.api.payload.bank.service;

import java.util.List;

import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.general.BankMeta;
import ng.openbanking.api.payload.general.GeneralCharges;
import ng.openbanking.api.payload.general.GeneralGetProduct;
import ng.openbanking.api.payload.general.GeneralInterfaceVersion;

public interface GeneralInfoService {

	GeneralInterfaceVersion getInterfaceVersion() throws  ServiceOperationNotSupported ;

	BankMeta getBankMeta() throws  ServiceOperationNotSupported ;

	List<GeneralCharges> getCharges() throws  ServiceOperationNotSupported ;

	List<GeneralGetProduct> getProducts() throws  ServiceOperationNotSupported ;

	

}
