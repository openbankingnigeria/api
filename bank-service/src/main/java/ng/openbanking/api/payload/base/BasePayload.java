package ng.openbanking.api.payload.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasePayload {

    private List<ExpansionField> expansionFields;
}
