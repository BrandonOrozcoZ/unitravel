package co.edu.uniquindio.unitravel.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Reservation implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private int code;

    @Column(name = "reserve_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar reserveDate;

    @Column(name = "start_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate endDate;

    @Column(name = "total_price", nullable = false, scale = 2)
    private float totalPrice;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(nullable = false)
    private int numPeople;

}
