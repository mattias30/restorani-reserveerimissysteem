package broneerimine.example.demo.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Primary key
    private long id;

    @Column(name = "seat_size", nullable = false) // Changes column name
    private int seatSize;  // 2,4,6,8

    @Column(name = "booked")
    private boolean booked;



}
