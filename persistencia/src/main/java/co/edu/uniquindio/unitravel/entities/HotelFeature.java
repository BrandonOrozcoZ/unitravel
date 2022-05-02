package co.edu.uniquindio.unitravel.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class HotelFeature implements Serializable{

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private int code;

    @Column(nullable = false)
    private String description;

    @ManyToMany
    private List<Hotel> hotels;

}
