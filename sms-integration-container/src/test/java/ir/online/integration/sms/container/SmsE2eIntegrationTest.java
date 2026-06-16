package ir.online.integration.sms.container;

import ir.online.integration.sms.infrastructure.config.SmsIntegrationInfrastructureConfiguration;
import ir.online.integration.sms.infrastructure.config.factory.SmsProviderFactoryAdapter;
import ir.online.integration.sms.shared.core.port.out.SmsClientAdapter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.webmvc.autoconfigure.WebMvcAutoConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = {
        SmsApplication.class,
        SmsClientAdapter.class,
        SmsIntegrationInfrastructureConfiguration.class,
        SmsProviderFactoryAdapter.class,
        WebMvcAutoConfiguration.class
})
@ActiveProfiles("test")
class SmsE2eIntegrationTest {

    @Autowired
    private SmsClientAdapter smsPort;

    @LocalServerPort
    private int localPort;

    @DynamicPropertySource
    static void configureProperties(DynamicPropertyRegistry registry) {
        registry.add("sms-service.baseUrl", () -> "http://localhost:1010/api/sms");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Integration test is strictly running on port: " + localPort);
    }

    @Test
    void sendOtp_ShouldSuccessfullyPassThroughWholeHttpLifecycle() {
        // Given
        String recipients = "09123456789";
        String code = "998877";

        // When & Then
        try {
            smsPort.sendOtp(recipients, code);
        } catch (Exception ex) {
            fail("E2E communication failed on port 1010: " + ex.getMessage());
        }
    }
}