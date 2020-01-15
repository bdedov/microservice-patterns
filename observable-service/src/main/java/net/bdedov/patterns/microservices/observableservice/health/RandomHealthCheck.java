package net.bdedov.patterns.microservices.observableservice.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class RandomHealthCheck implements HealthIndicator {

	@Override public Health health() {
		if (Math.random() < .5) {
			return Health.up().withDetail("Observability", "rulzzz").build();
		} else {
			return Health.down().withDetail("Conlsusion", "With random checker you never know.").build();
		}
	}

}
