package com.example.helloworld.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class HelloworldServiceTest {

    private final HelloworldService helloworldService;

    @Autowired
    public HelloworldServiceTest(HelloworldService helloworldService) {
        this.helloworldService = helloworldService;
    }

    @Test
    void sampleTest() throws Exception {
        String result = helloworldService.getString();
        assertThat(result).isEqualTo("helloworld");
    }
}
