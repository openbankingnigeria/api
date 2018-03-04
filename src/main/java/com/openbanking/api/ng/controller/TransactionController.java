package com.openbanking.api.ng.controller;
import com.openbanking.api.ng.payload.transaction.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/transaction")
@Api(value = "/transaction", description = "Transaction related operations", consumes = "application/json", tags = {"transaction"})
public class TransactionController {

    @RequestMapping(value = "/transfer/intra-bank", method = RequestMethod.POST)
    public List<SingleTransferBankOutput> singleTransferWithinBank(@RequestBody SingleTransferBank singleTransferBank) {
        return Collections.singletonList(new SingleTransferBankOutput());
    }

    @RequestMapping(value = "/transfer/inter-bank", method = RequestMethod.POST)
    public List<SingleTransferBankOutput> singleTransferOtherBank(@RequestBody SingleTransferBank singleTransferBank) {
        return Collections.singletonList(new SingleTransferBankOutput());
    }

    @RequestMapping(value = "/transfer/email/{email}", method = RequestMethod.POST)
    public List<SingleTransferBankOutput> singleTransferToEmail(@PathVariable String email, @RequestBody SingleTransfer singleTransfer) {
        return Collections.singletonList(new SingleTransferBankOutput());
    }

    @RequestMapping(value = "/transfer/phone/{phone}", method = RequestMethod.POST)
    public List<SingleTransferBankOutput> singleTransferToPhone(@PathVariable String phone, @RequestBody SingleTransfer singleTransfer) {
        return Collections.singletonList(new SingleTransferBankOutput());
    }

    @RequestMapping(value = "/transfers/inter-bank", method = RequestMethod.POST)
    public List<MultipleTransferBankOutput> multipleTransferWithinBank(@RequestBody MultipleTransferBank multipleTransferBank) {
        return Collections.singletonList(new MultipleTransferBankOutput());
    }

    @RequestMapping(value = "/transfers/intra-bank", method = RequestMethod.POST)
    public List<MultipleTransferBankOutput> multipleTransferOtherBank(@RequestBody MultipleTransferBank multipleTransferBank) {
        return Collections.singletonList(new MultipleTransferBankOutput());
    }
    @RequestMapping(value = "/transfer/emails/", method = RequestMethod.POST)
    public List<MultipleTransferBankOutput> multipleTransferToPhone(@RequestBody MultipleTransfer multipleTransfer) {
        return Collections.singletonList(new MultipleTransferBankOutput());
    }
    @RequestMapping(value = "/multipleTransferToEmail", method = RequestMethod.GET)
    public List<MultipleTransferBankOutput> multipleTransferToEmail(@RequestBody MultipleTransfer multipleTransfer) {
        return Collections.singletonList(new MultipleTransferBankOutput());
    }
    @RequestMapping(value = "/placeHold", method = RequestMethod.POST)
    public List<PlaceHoldOutput> placeHold(@RequestBody PlaceHold placeHold) {
        return Collections.singletonList(new PlaceHoldOutput());
    }
    @RequestMapping(value = "/getHold", method = RequestMethod.GET)
    public List<GetHoldOutput> getHold(@ApiParam(value="Account Number and Hold Reference ID")String accountNumber, String holdReferenceId) {
        return Collections.singletonList(new GetHoldOutput());
    }
    @RequestMapping(value = "/removeHold", method = RequestMethod.POST)
    public List<RemoveHoldOutput> removeHold(@ApiParam(value="Account Number and Reference ID") String accountNumber, String holdReferenceId) {
        return Collections.singletonList(new RemoveHoldOutput());
    }
    @RequestMapping(value = "/placePnd", method = RequestMethod.POST)
    public List<PlacePnd> placePnd(@ApiParam(value="Account Number, Reference ID, Amount and Reason") String accountNumber, String pndReferenceId, String amount, String reason) {
        return Collections.singletonList(new PlacePnd());
    }
    @RequestMapping(value = "/getStatement", method = RequestMethod.GET)
    public List<GetStatementOutput> getStatement(@RequestBody GetStatement getStatement){
        return Collections.singletonList(new GetStatementOutput());
    }

}
