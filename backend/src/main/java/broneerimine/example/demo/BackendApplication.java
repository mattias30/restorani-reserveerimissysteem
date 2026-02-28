package broneerimine.example.demo;

import broneerimine.example.demo.entity.Test;
import broneerimine.example.demo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner { // to run logic once at startup

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Autowired
	private TestRepository testRepository; // to use these methods here

	@Override
	public void run(String... args) throws Exception { //runs once

		Test t1 = Test.builder()
				.firstName("Hello")
				.lastName("World")
				.build();

		Test t2 = Test.builder()
				.firstName("Nice")
				.lastName("Day")
				.build();

		Test t3 = Test.builder()
				.firstName("Hi")
				.lastName("!")
				.build();

		// must save these to the repository (also saveAll, but must create a list first then)
		testRepository.save(t1);
		testRepository.save(t2);
		testRepository.save(t3);

	}
}
