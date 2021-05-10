package com.marvastsi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.marvastsi.spring.security.x509.X509AuthenticationServer;

@SpringBootTest(classes = X509AuthenticationServer.class)
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
