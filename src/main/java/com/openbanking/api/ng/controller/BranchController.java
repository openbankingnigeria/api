package com.openbanking.api.ng.controller;
import com.openbanking.api.ng.payload.branch.Branch;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.List;
@RestController
@RequestMapping("/branch")
@Api(value = "/branch", description = "Branch related operations", consumes = "application/json", tags = {"branch"})
public class BranchController {

        @ApiOperation(value = "Finds a Bank Branch by Branch Code",
                notes = "The Branch Code is the unique identifier for a bank  as defined by a Bank",
                response = Branch.class)
        @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Branch Code supplied"),
                @ApiResponse(code = 404, message = "Branch not found")})

        @RequestMapping(value = "/getBranch", method = RequestMethod.GET)
        public Branch getBranch(@ApiParam(value = "The Branch's unique identifier") String branchId) {
            return new Branch();
        }
        @RequestMapping(value = "/getBranches", method = RequestMethod.GET)
        public List<Branch> getBranches(){
                return Collections.singletonList(new Branch());
        }
        @RequestMapping(value = "/getBranchesAtLocation", method = RequestMethod.GET)
        public List<Branch> getBranchesAtLocation(){
                return Collections.singletonList(new Branch());
        }



}
