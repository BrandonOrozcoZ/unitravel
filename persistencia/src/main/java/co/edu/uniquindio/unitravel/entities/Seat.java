package co.edu.uniquindio.unitravel.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Seat implements Serializable {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private int code;

    @Column(nullable = false)
    private String position;

    @Column(nullable = false, scale = 2)
    @Positive
    private float price;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Flight flight;

    @OneToMany(mappedBy = "seat")
    private List<Reservation_Seat> reservations;

    public Seat(int code, String position, float price, Flight flight) {
        this.code = code;
        this.position = position;
        this.price = price;
        this.flight = flight;
    }
}
