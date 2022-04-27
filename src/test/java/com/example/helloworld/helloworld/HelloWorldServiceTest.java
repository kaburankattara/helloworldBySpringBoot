package com.example.helloworld.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class HelloWorldServiceTest {

    private final HelloWorldService helloWorldService;

    @Autowired
    public HelloWorldServiceTest(HelloWorldService helloworldService) {
        this.helloWorldService = helloworldService;
    }

    @Test
    void HelloWorldが取得されることを確認() throws Exception {
        String result = helloWorldService.getString();
        assertThat(result).isEqualTo("HelloWorld");
    }
}
