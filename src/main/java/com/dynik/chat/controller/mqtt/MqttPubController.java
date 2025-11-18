package com.dynik.chat.controller.mqtt;

import com.dynik.chat.service.MqttPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/mqtt")
public class MqttPubController {

    private final MqttPublisher mqttPublisher;

    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestParam String topic, @RequestBody String message) {

        // MqttGateway의 두 번째 메서드를 사용하여 발행 (QoS는 1로 설정 예시)
        mqttPublisher.publish(topic, message);

        return ResponseEntity.ok("Message published to MQTT broker: " + topic);
    }
}
