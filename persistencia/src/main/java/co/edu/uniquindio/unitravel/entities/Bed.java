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
public class Bed implements Serializable {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private int code;

    @Enumerated(EnumType.STRING)
    private Type type;

    @ManyToMany
    private List<Room> rooms;

    public Bed(int code, Type type) {
        this.code = code;
        this.type = type;
    }
}
