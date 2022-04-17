package com.gustavosouza;

import com.gustavosouza.model.Course;
import com.gustavosouza.repository.CourseRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackSpringApplication.class, args);
	}

	// Inicializa BD
	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();
			Course c = new Course();
			c.setName("Angular com Spring");
			c.setCategory("Front-end");
			courseRepository.save(new Course());
		};
	}
}
