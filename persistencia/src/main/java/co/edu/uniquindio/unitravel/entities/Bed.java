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
public class Bed implements Serializable {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Integer code;

    @Enumerated(EnumType.STRING)
    private Type type;

    @ManyToMany
    @ToString.Exclude
    private List<Room> rooms;

    public Bed(int code, Type type) {
        this.code = code;
        this.type = type;
    }
}
