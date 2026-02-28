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

    @Column(name = "first_name", nullable = false) // Changes column name
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}
