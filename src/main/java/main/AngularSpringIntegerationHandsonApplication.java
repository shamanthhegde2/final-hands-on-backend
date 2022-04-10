package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("controller")
@SpringBootApplication
@EnableJpaRepositories("dao")
@EntityScan("model")
public class AngularSpringIntegerationHandsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularSpringIntegerationHandsonApplication.class, args);
	}

}
