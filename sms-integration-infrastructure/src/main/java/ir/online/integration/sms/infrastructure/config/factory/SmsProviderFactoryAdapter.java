package ir.online.integration.sms.infrastructure.config.factory;

import io.qoop.fault.handler.api.exception.DomainException;
import ir.online.integration.sms.application.port.in.config.factory.SmsProviderFactory;
import ir.online.shared.sms.application.port.out.SmsPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 1/17/2026 7:09 PM
 * Package: ir.online.integration.sms.infrastructure.config
 */

@Service
@RequiredArgsConstructor
public class SmsProviderFactoryAdapter implements SmsProviderFactory {

    @Value("${sms.provider}")
    private String smsProvider;
    private final Map<String, SmsPort> smsProviderMap;

    @Override
    public SmsPort smsPort() {
        if (smsProvider == null || smsProvider.isEmpty()) {
            throw DomainException.of("sms.provider.notConfigured", 500);
        }

        SmsPort port = smsProviderMap.get(smsProvider);

        if (port == null) {
            throw DomainException.withParams("sms.provider.notFound", smsProvider);
        }

        return port;
    }
}