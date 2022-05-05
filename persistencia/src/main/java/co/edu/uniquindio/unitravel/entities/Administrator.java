package co.edu.uniquindio.unitravel.entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Administrator extends Person implements Serializable {

    public Administrator(String id, String name, @Email String email, String password) {
        super(id, name, email, password);
    }

}
