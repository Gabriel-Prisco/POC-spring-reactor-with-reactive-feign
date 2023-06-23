package com.valemobi.pocspringreactorwithreactivefeign.infraestructure.webclient;

import io.netty.channel.ChannelOption;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Configuration
@SuppressWarnings("unused")
public class WebClientConfig {

    @Bean
    public WebClient webClient() {
        HttpClient client = HttpClient.create()
            .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 10_000);


        return WebClient.builder()
            .baseUrl("http://localhost:8081/faker")
            .clientConnector(new ReactorClientHttpConnector(client))
            .defaultHeader(CONTENT_TYPE, APPLICATION_JSON_VALUE)
            .build();
    }

}
