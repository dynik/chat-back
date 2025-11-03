package com.dynik.chat.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("mqtt")
public class MqttProperties {
    private String url;
    private int port;
    private int qos;
    private String topic;
}
