package broneerimine.example.demo.repository;

import broneerimine.example.demo.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> { //CRUD methods, all methods to do on Seat entity
}
