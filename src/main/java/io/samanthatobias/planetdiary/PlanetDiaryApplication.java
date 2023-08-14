package io.samanthatobias.planetdiary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("io.samanthatobias.planetdiary.*")
@ComponentScan(basePackages = { "io.samanthatobias.planetdiary.*" })
@EntityScan("io.samanthatobias.planetdiary.*")
public class PlanetDiaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanetDiaryApplication.class, args);
	}

}
