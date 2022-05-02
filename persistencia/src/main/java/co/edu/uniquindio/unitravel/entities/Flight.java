package co.edu.uniquindio.unitravel.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Flight implements Serializable {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private int code;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FlightStatus status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Airline airline;

    @OneToMany(mappedBy = "flight")
    private List<Seat> seats;

    @ManyToOne
    @JoinColumn(nullable = false)
    private City from;

    @ManyToOne
    @JoinColumn(nullable = false)
    private City destination;



}
