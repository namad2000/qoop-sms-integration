package ir.online.integration.sms.infrastructure.port.out.faraz.dto.res.otp;

import ir.online.integration.sms.infrastructure.port.out.faraz.dto.res.SendingRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 1/15/2026 8:20 PM
 * Package: ir.online.integration.sms.infrastructure.adapter.faraz.dto.res
 */

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class OtpSendingRequest extends SendingRequest<OtpParams> {
}
