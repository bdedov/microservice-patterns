package net.bdedov.patterns.microservices.crosscuttingservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "greetings")
@Data
public class GreetingsConfig {

	private String location;

}
