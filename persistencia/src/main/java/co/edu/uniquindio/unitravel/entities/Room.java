package co.edu.uniquindio.unitravel.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Positive;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Room implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private int number;

    @Column(nullable = false, scale = 2)
    private float price;

    @Column(nullable = false)
    private int capacity;


}
