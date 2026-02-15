package ir.online.integration.sms.infrastructure.port.out.faraz;

import ir.online.integration.sms.infrastructure.port.out.faraz.dto.res.otp.OtpSendingRequest;
import ir.online.shared.sms.application.port.out.SmsPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * @author Davood Akbari - 1404
 * daak1365@gmail.com
 * daak1365@yahoo.com
 * 09125188694
 */

@Service("FARAZ_SMS")
@RequiredArgsConstructor
public class FarazSmsAdapter implements SmsPort {

    @Value("${sms.token)")
    private String token;

    private final FarazSmsClient farazSmsClient;
    private final FarazBuilder farazBuilder;

    @Override
    public void SendOtp(String recipients, String Code) {
        OtpSendingRequest otpSendingRequest = farazBuilder.buildOtpSendingRequest(recipients, Code);

        farazSmsClient.sendOtp(otpSendingRequest, token);
    }
}

