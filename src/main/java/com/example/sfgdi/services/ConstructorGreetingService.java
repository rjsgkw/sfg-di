package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service // this tells Spring that this is a Spring managed component, and to bring it into the Spring context
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
