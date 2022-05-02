package co.edu.uniquindio.unitravel.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Reservation implements Serializable {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private int code;

    @Column(name = "reserve_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar reserveDate;

    @Column(name = "start_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar startDate;

    @Column(name = "end_date", nullable = false)
    @Temporal(TemporalType.DATE)
    @Future
    private Calendar endDate;

    @Column(name = "total_price", nullable = false, scale = 2)
    @Positive
    private float totalPrice;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Positive
    @Column(nullable = false)
    private int numPeople;

    @ManyToMany
    private List<Seat> seats;

    @ManyToMany
    private List<Bedroom> reservedBedrooms;

    @ManyToOne
    private Client client;

    public Reservation(int code, Calendar reserveDate, Calendar startDate, Calendar endDate, float totalPrice, Status status, int numPeople, List<Bedroom> reservedBedrooms, Client client) {
        this.code = code;
        this.reserveDate = reserveDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice;
        this.status = status;
        this.numPeople = numPeople;
        this.reservedBedrooms = reservedBedrooms;
        this.client = client;
    }
}
