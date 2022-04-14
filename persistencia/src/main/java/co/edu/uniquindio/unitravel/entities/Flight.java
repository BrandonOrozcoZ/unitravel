package co.edu.uniquindio.unitravel.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Flight implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private int code;

    @Enumerated(EnumType.STRING)
    private FlightStatus status;

    @Enumerated(EnumType.STRING)
    private Airline airline;



}
