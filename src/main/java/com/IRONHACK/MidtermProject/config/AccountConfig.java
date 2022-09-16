package com.IRONHACK.MidtermProject.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.jackson.datatype.money.MoneyModule;

@Configuration
public class AccountConfig {

    @Bean
    public MoneyModule moneyModule() {
        return new MoneyModule();
    }
}
