package ir.online.integration.sms.infrastructure.config;

import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.naming.spi.ObjectFactory;


/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 1/15/2026 7:41 PM
 * Package: ir.online.integration.sms.infrastructure.config
 */

@Configuration
@EnableFeignClients("ir.online.integration.sms.infrastructure.port.out.sms.client")
public class SmsIntegrationInfrastructureConfiguration {
    @Bean
    public Encoder jsonEncoder(ObjectFactory converters) {
        return new SpringEncoder(converters);
    }

    @Bean
    public Decoder jsonDecoder(ObjectFactory converters) {
        return new ResponseEntityDecoder(new SpringDecoder(converters));
    }
}