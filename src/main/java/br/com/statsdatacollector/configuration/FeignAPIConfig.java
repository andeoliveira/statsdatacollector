package br.com.statsdatacollector.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = {"br.com.statsdatacollector.infrastructure.restclient"})
public class FeignAPIConfig { }
