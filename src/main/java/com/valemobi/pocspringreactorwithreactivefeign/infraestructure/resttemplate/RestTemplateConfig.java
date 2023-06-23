package com.valemobi.pocspringreactorwithreactivefeign.infraestructure.resttemplate;

import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
@SuppressWarnings("unused")
public class RestTemplateConfig {

    /** {@value} */
    public static final int DEFAULT_MAX_CONNECTIONS = 100_000;

    /** {@value} */
    public static final int DEFAULT_CONNECTION_TIMEOUT = 25000;

    /** {@value} */
    public static final int DEFAULT_SOCKET_TIMEOUT = 60000;

    /** {@value} */
    public static final int DEFAULT_CONNECTION_POOL_TIMEOUT = 0;

    /** {@value} */
    public static final int DEFAULT_MAX_CONNECTION_RETRIES = 4;

    /** {@value} */
    public static final int DEFAULT_INACTIVITY_TIME_BEFORE_STALE_CHECK = 5000;

    @Bean
    public RestTemplate restTemplate() {
        PoolingHttpClientConnectionManager connectionManager = buildConnectionPool();

        RequestConfig requestConfig =  buildRequestConfig(DEFAULT_CONNECTION_TIMEOUT , DEFAULT_SOCKET_TIMEOUT ,DEFAULT_CONNECTION_POOL_TIMEOUT);

        HttpClient httpClient = HttpClientBuilder.create()
            .setConnectionManager(connectionManager)
            .setDefaultRequestConfig(requestConfig).build();

        ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);


        return new RestTemplate(requestFactory);
    }


    private static PoolingHttpClientConnectionManager buildConnectionPool() {
        PoolingHttpClientConnectionManager connectionPool = new PoolingHttpClientConnectionManager();
        connectionPool.setMaxTotal(RestTemplateConfig.DEFAULT_MAX_CONNECTIONS);
        connectionPool.setDefaultMaxPerRoute(RestTemplateConfig.DEFAULT_MAX_CONNECTIONS);
        connectionPool.setValidateAfterInactivity(RestTemplateConfig.DEFAULT_INACTIVITY_TIME_BEFORE_STALE_CHECK);

        return connectionPool;
    }


    private static RequestConfig buildRequestConfig(int connectionTimeout, int socketTimeout, int poolTimeout ) {
        return RequestConfig.custom()
            .setConnectionRequestTimeout( poolTimeout )
            .setConnectTimeout( connectionTimeout )
            .setSocketTimeout( socketTimeout )
            .build();
    }

}
