package ir.online.integration.sms.infrastructure.port.out.sms.dto.res.otp;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class VerifyResponse extends SmsResponse<VerifyDto> {
}