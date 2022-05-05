package co.edu.uniquindio.unitravel.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.PositiveOrZero;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Comment implements Serializable {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Integer code;

    @Column(length = 100, nullable = false)
    private String comment;

    @PositiveOrZero
    @Column(nullable = false, precision = 1, scale = 1)
    @Min(0) @Max(5)
    private float rating;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar date;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Hotel hotelComment;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Client clientUser;

}
