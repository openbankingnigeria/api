package com.openbanking.api.ng.payload.account;

import com.openbanking.api.ng.definition.BlockType;

import lombok.Data;

@Data
public class AccountBlock {
    private String accountNumber;
    private BlockType blockType;
    private String blockMessage;

    
}
