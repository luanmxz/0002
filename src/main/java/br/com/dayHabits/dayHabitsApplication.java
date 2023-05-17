package br.com.dayHabits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJpaRepositories("br.com.dayHabits.*")
@ComponentScan(basePackages = { "br.com.dayHabits.*" })
@EntityScan("br.com.dayHabits.*")   
public class dayHabitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(dayHabitsApplication.class, args);
	}

}
