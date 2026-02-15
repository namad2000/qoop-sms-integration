package ir.online.integration.sms.infrastructure.port.out.faraz;

import lombok.Getter;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 1/15/2026 8:40 PM
 * Package: ir.online.integration.sms.infrastructure.faraz
 */


@Getter
public enum SendingType {
    PATTERN("pattern"),
    JOB("job"),
    COUNTRY("country"),
    KEYWORD_PHONEBOOK("keyword_phonebook"),
    KEYWORD("keyword"),
    FILE("file");

    private final String code;

    SendingType(String code) {
        this.code = code;
    }
}
