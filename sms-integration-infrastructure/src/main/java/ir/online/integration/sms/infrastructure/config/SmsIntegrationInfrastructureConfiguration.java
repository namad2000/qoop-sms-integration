package ir.online.integration.sms.infrastructure.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;


/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 1/15/2026 7:41 PM
 * Package: ir.online.integration.sms.infrastructure.config
 */

@Configuration
@EnableFeignClients("ir.online.integration.sms.infrastructure.port.out.sms.client")
public class SmsIntegrationInfrastructureConfiguration {
}