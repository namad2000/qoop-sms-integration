package ir.online.integration.sms.application.port.in.usecase;

import io.qoop.filter.bean.api.UseCaseService;
import io.qoop.validation.api.NotEmpty;
import ir.online.integration.sms.application.port.in.config.factory.SmsProviderFactory;
import ir.online.shared.sms.application.port.out.SmsPort;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 1/17/2026 4:46 PM
 * Package: ir.online.integration.sms.application.port.in.usecase
 */

@UseCaseService
public class SmsUseCase {
    private final SmsPort smsPort;

    public SmsUseCase(SmsProviderFactory smsProviderFactory) {
        this.smsPort = smsProviderFactory.smsPort();
    }


    public void SendOtp(@NotEmpty String recipients, @NotEmpty String code) {
        smsPort.SendOtp(recipients, code);
    }
}
