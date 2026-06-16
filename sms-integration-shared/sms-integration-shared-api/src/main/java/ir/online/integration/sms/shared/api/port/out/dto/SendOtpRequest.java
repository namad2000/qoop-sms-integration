package ir.online.integration.sms.shared.api.port.out.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 1/17/2026 4:26 PM
 * Package: ir.online.integration.sms.shared.api.port.out.dto.req
 */

@Data
@SuperBuilder
@NoArgsConstructor
public class SendOtpRequest {
    private String recipients;
    private String code;
}
