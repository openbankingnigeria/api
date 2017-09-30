package com.openbanking.api.ng.controller;
import com.openbanking.api.ng.payload.atm.ATM;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/atm")
@Api(value = "/atm", description = "ATM related operations", consumes = "application/json", tags = {"atm"})
public class ATMController {

    @ApiOperation(value = "Finds an ATM by Terminal ID",
            notes = "The ....",
            response = ATM.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Terminal ID supplied"),
            @ApiResponse(code = 404, message = "ATM not found")})
    @RequestMapping(value = "/getATM", method = RequestMethod.GET)
    public ATM getAtm(@ApiParam(value = "The Atm unique identifier") String atmTerminalId){
        return new ATM();
    }

    @ApiOperation(value = "Get all ATMs in a Bank",
            notes = "The ....")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Terminal ID supplied"),
            @ApiResponse(code = 404, message = "ATM not found")})
    @RequestMapping(value = "/getATMs", method = RequestMethod.GET)
    public List<ATM> getAtms(){
        return Collections.singletonList(new ATM());
    }

    @RequestMapping(value = "/getATMsByBranch", method = RequestMethod.GET)
    public List<ATM> getAtmsByBranch(@ApiParam(value = "The Bank's Branch code") String branchCode){
        return Collections.singletonList(new ATM());
    }
    @RequestMapping(value = "/getATMsNearLocation", method = RequestMethod.GET)
    public List<ATM> getatmsnearlocation(@ApiParam(value = "The ATM's longitude and latitude") int latitude, int longitude){
        return Collections.singletonList(new ATM());
    }
}
