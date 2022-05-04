package co.edu.uniquindio.unitravel.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Client extends Person implements Serializable {

    @ManyToOne
    private City clientCity;

    @OneToMany(mappedBy = "clientUser")
    private List<Comment> comments;

    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations;

    @ManyToMany
    private List<Hotel> favorites;

    @ToString.Include
    @ElementCollection
    private Map<String, String> telephone;

    public Client(String id, String name, @Email String email, String password) {
        super(id, name, email, password);
    }
}
