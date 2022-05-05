package co.edu.uniquindio.unitravel.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Manager extends Person implements Serializable {

    @OneToMany(mappedBy = "manager")
    @ToString.Exclude
    private List<Hotel> hotels;

    public Manager(String id, String name, @Email String email, String password) {
        super(id, name, email, password);
    }
}
