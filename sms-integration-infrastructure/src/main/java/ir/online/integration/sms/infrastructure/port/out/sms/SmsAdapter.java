package ir.online.integration.sms.infrastructure.port.out.sms;

import ir.online.integration.sms.infrastructure.port.out.sms.client.SmsIrClient;
import ir.online.integration.sms.infrastructure.port.out.sms.dto.req.VerifySendingRequestDto;
import ir.online.integration.sms.shared.api.port.out.SmsPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * @author Davood Akbari - 1404
 * daak1365@gmail.com
 * daak1365@yahoo.com
 * 09125188694
 */

@Service("SMS_IR")
@RequiredArgsConstructor
public class SmsAdapter implements SmsPort {

    @Value("${sms.token}")
    private String token;

    private final SmsIrClient smsIrClient;
    private final SmsBuilder smsBuilder;

    @Override
    public void sendOtp(String recipients, String code) {
        VerifySendingRequestDto verifySendingRequest = smsBuilder.buildVerifySendingRequestDto(recipients, code);
        smsIrClient.sendVerify(verifySendingRequest, token);
    }
}

