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

		Test t2f = Test.builder()
				.seatSize(2)
				.booked(false)
				.build();

		Test t4f = Test.builder()
				.seatSize(4)
				.booked(false)
				.build();

		Test t6f = Test.builder()
				.seatSize(6)
				.booked(false)
				.build();

		Test t8f = Test.builder()
				.seatSize(8)
				.booked(false)
				.build();

		Test t2t = Test.builder()
				.seatSize(2)
				.booked(true)
				.build();

		Test t4t = Test.builder()
				.seatSize(4)
				.booked(true)
				.build();

		Test t6t = Test.builder()
				.seatSize(6)
				.booked(true)
				.build();

		Test t8t = Test.builder()
				.seatSize(8)
				.booked(true)
				.build();

		// must save these to the repository (also saveAll, but must create a list first then)
		testRepository.save(t2f);
		testRepository.save(t4f);
		testRepository.save(t6f);
		testRepository.save(t8f);
		testRepository.save(t2t);
		testRepository.save(t4t);
		testRepository.save(t6t);
		testRepository.save(t8t);

	}
}
