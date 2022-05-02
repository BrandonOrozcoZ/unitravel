package co.edu.uniquindio.unitravel.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person implements Serializable {
    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private String id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 200, nullable = false, unique = true)
    @Email
    private String email;

    @Column(nullable = false)
    private String password;

}
