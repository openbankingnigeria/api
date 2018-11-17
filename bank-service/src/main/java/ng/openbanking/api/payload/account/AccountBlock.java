package ng.openbanking.api.payload.account;

import ng.openbanking.api.payload.definition.BlockType;

import lombok.Data;

@Data
public class AccountBlock {
    private String accountNumber;
    private BlockType blockType;
    private String blockMessage;

    
}
