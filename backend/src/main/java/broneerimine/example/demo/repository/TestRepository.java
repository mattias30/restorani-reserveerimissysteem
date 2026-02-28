package broneerimine.example.demo.repository;

import broneerimine.example.demo.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> { //CRUDA methods, all methods to do on Test entity



}
