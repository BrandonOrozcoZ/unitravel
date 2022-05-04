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
public class City implements Serializable {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Integer code;

    @Column(length = 100, nullable = false)
    private String name;

    @OneToMany(mappedBy = "city")
    private List<Hotel> hotels;

    @OneToMany(mappedBy = "from")
    private List<Flight> origins;

    @OneToMany(mappedBy = "destination")
    private List<Flight> destinations;

    @OneToMany(mappedBy = "clientCity")
    private List<Client> clients;

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
