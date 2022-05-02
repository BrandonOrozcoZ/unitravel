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
public class RoomFeature implements Serializable {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private int code;

    @Column(nullable = false)
    private String description;

    @ManyToMany
    private List<Bedroom> roomsFeatures;

    public RoomFeature(int code, String description, List<Bedroom> roomsFeatures) {
        this.code = code;
        this.description = description;
        this.roomsFeatures = roomsFeatures;
    }
}
