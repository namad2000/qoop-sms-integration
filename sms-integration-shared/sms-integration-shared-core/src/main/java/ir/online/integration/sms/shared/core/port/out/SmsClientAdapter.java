package ir.online.integration.sms.shared.core.port.out;

import ir.online.integration.sms.shared.api.port.out.SmsPort;
import ir.online.integration.sms.shared.api.port.out.dto.SendOtpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 6/14/2026 5:32 PM
 * Package: ir.online.integration.sms.shared.core.port.out
 */

@Service
@RequiredArgsConstructor
public class SmsClientAdapter implements SmsPort {
    private final SmsClient smsClient;
    private final SmsClientMapper smsClientMapper;

    @Override
    public void sendOtp(String recipients, String code) {
        SendOtpRequest sendOtpRequest = smsClientMapper.toSendOtpRequest(recipients, code);
        smsClient.sendOtp(sendOtpRequest);
    }
}
