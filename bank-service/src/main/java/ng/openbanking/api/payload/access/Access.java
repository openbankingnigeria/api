package ng.openbanking.api.payload.access;
import java.util.Timer;

import lombok.Data;

@Data
public class Access {
    private String accessToken;
    private Timer expirationTime;
    private String tokenType = "Soft Token";

   
}
