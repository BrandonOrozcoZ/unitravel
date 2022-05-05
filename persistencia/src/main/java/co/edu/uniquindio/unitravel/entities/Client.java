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
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Client extends Person implements Serializable {

    @ManyToOne
    private City clientCity;

    @OneToMany(mappedBy = "clientUser")
    @ToString.Exclude
    private List<Comment> comments;

    @OneToMany(mappedBy = "client")
    @ToString.Exclude
    private List<Reservation> reservations;

    @ManyToMany
    @ToString.Exclude
    private List<Hotel> favorites;

    @ElementCollection
    private Map<String, String> telephone;

    public Client(String id, String name, @Email String email, String password) {
        super(id, name, email, password);
    }
}
