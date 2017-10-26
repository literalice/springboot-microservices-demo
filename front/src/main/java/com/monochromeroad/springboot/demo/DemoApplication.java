package com.monochromeroad.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RestController
    static class DemoRestController {

        private final RestOperations restOperations;

        public DemoRestController(RestTemplateBuilder restTemplateBuilder) {
            this.restOperations = restTemplateBuilder.build();
        }

        @RequestMapping("/")
        String greeting() {
            Greeting greeting = restOperations.getForObject("http://greeting:8080/greeting", Greeting.class);
            return greeting.getContent();
        }
    }
}

