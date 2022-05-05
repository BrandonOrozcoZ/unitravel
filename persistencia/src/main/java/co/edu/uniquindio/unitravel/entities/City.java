package co.edu.uniquindio.unitravel.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class City implements Serializable {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Integer code;

    @Column(length = 100, nullable = false)
    private String name;

    @OneToMany(mappedBy = "city")
    @ToString.Exclude
    private List<Hotel> hotels;

    @OneToMany(mappedBy = "from")
    @ToString.Exclude
    private List<Flight> origins;

    @OneToMany(mappedBy = "destination")
    @ToString.Exclude
    private List<Flight> destinations;

    @OneToMany(mappedBy = "clientCity")
    @ToString.Exclude
    private List<Client> clients;

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
