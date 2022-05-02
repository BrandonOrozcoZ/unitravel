package co.edu.uniquindio.unitravel.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Administrator extends Person implements Serializable {

    private String post;

    public Administrator(String id, String name, @Email String email, String password, String post) {
        super(id, name, email, password);
        this.post = post;
    }
}
