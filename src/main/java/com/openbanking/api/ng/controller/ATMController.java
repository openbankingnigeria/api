package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.payload.atm.ATM;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/atms")
@Api(value = "/atms", description = "ATM related operations", consumes = "application/json", tags = {"atm"})
public class ATMController {

    @ApiOperation(value = "Finds an ATM by Terminal ID",
            notes = "The ....",
            response = ATM.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Terminal ID supplied"),
            @ApiResponse(code = 404, message = "ATM not found")})
    @RequestMapping(value = "/{terminalId}", method = RequestMethod.GET)
    public ATM getAtm(@PathVariable @ApiParam(value = "The Atm unique identifier") String terminalId) {
        return new ATM();
    }

    @ApiOperation(value = "Get all ATMs in a Bank",
            notes = "The ....")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Terminal ID supplied"),
            @ApiResponse(code = 404, message = "ATM not found")})
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<ATM> getAtms(){
        return Collections.singletonList(new ATM());
    }

    @RequestMapping(value = "/branch/{branchCode}", method = RequestMethod.GET)
    public List<ATM> getAtmsByBranch(@PathVariable @ApiParam(value = "The Bank's Branch code") String branchCode) {
        return Collections.singletonList(new ATM());
    }

    @RequestMapping(value = "/latitude/{latitude}/longitude/{longitude}", method = RequestMethod.GET)
    public List<ATM> getAtmsAtLocation(@PathVariable @ApiParam(value = "The location's latitude") int latitude,
                                       @PathVariable @ApiParam(value = "The location's longitude") int longitude) {
        return Collections.nCopies(3, new ATM());
    }
}
