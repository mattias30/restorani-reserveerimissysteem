package broneerimine.example.demo;

import broneerimine.example.demo.entity.Seat;
import broneerimine.example.demo.repository.SeatRepository;
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
	private SeatRepository seatRepository; // to use these methods here

	@Override
	public void run(String... args) throws Exception { //runs once

		Seat t2f = Seat.builder()
				.seatSize(2)
				.booked(false)
				.build();

		Seat t4f = Seat.builder()
				.seatSize(4)
				.booked(false)
				.build();

		Seat t6f = Seat.builder()
				.seatSize(6)
				.booked(false)
				.build();

		Seat t8f = Seat.builder()
				.seatSize(8)
				.booked(false)
				.build();

		Seat t2t = Seat.builder()
				.seatSize(2)
				.booked(true)
				.build();

		Seat t4t = Seat.builder()
				.seatSize(4)
				.booked(true)
				.build();

		Seat t6t = Seat.builder()
				.seatSize(6)
				.booked(true)
				.build();

		Seat t8t = Seat.builder()
				.seatSize(8)
				.booked(true)
				.build();
/**
		Seat t8t = Seat.builder()
				.seatSize(8)
				.booked(true)
				.build();

		Seat t8t = Seat.builder()
				.seatSize(8)
				.booked(true)
				.build();

		Seat t8t = Seat.builder()
				.seatSize(8)
				.booked(true)
				.build();

		Seat t8t = Seat.builder()
				.seatSize(8)
				.booked(true)
				.build();

		Seat t8t = Seat.builder()
				.seatSize(8)
				.booked(true)
				.build();
 **/

		// must save these to the repository (also saveAll, but must create a list first then)
		seatRepository.save(t2f);
		seatRepository.save(t4f);
		seatRepository.save(t6f);
		seatRepository.save(t8f);
		seatRepository.save(t2t);
		seatRepository.save(t4t);
		seatRepository.save(t6t);
		seatRepository.save(t8t);

	}
}
