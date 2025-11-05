package com.dynik.chat.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("mqtt")
public class MqttProperties {
    private String url;
    private int port;
    private int qos;
    private String topic;
}
