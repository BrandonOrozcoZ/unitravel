package co.edu.uniquindio.unitravel.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Seat implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private int code;

    @Column(nullable = false)
    private String position;

    @Column(nullable = false, scale = 2)
    private float price;

}
