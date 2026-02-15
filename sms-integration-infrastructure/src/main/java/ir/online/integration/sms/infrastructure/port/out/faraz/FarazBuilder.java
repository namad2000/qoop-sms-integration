package ir.online.integration.sms.infrastructure.port.out.faraz;

import ir.online.integration.sms.infrastructure.port.out.faraz.dto.res.otp.OtpParams;
import ir.online.integration.sms.infrastructure.port.out.faraz.dto.res.otp.OtpSendingRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 1/15/2026 8:53 PM
 * Package: ir.online.integration.sms.infrastructure.faraz
 */

@Component
public class FarazBuilder {

    @Value("${sms.fromNumber)")
    private String fromNumber;

    public OtpSendingRequest buildOtpSendingRequest(String recipients, String Code) {
        OtpParams otpParams = OtpParams.builder()
                .name(Code)
                .charge(Code)
                .complex_name(Code)
                .build();

        return OtpSendingRequest.builder()
                .code("7zevrpxthmvizng")
                .fromNumber(fromNumber)
                .recipients(Collections.singletonList(recipients))
                .params(otpParams)
                .build();
    }
}
