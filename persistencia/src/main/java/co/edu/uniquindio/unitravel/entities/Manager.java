package co.edu.uniquindio.unitravel.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Manager extends Person implements Serializable {

    @OneToMany(mappedBy = "manager")
    private List<Hotel> hotels;

    public Manager(String id, String name, @Email String email, String password, List<Hotel> hotels) {
        super(id, name, email, password);
        this.hotels = hotels;
    }
}
