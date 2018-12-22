package ng.openbanking.api.payload.card;
import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;
import ng.openbanking.api.payload.definition.ChannelType;
import ng.openbanking.api.payload.definition.PeriodType;

import java.util.List;

@Data
public class SetCardLimit  extends BasePayload {
    private List<ChannelType> channelType;
    private String channel;
    private String transactionType;
    private PeriodType periodType;

    
}
