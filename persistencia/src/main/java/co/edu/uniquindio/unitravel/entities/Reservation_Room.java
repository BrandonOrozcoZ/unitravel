package co.edu.uniquindio.unitravel.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.PositiveOrZero;
import java.io.Serializable;


@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
public class Reservation_Room implements Serializable {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private int code;

    @PositiveOrZero
    @Column(nullable = false, scale = 2)
    private float price;

    @ManyToOne
    private Reservation reservation;

    @ManyToOne
    private Room room;


}
