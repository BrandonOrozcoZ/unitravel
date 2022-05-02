package co.edu.uniquindio.unitravel.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Photo implements Serializable {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private int code;

    @Column(nullable = false)
    private String url;

    @ManyToOne
    private Hotel hotelPhotos;

    @ManyToOne
    private Bedroom bedroomPhotos;

    public Photo(int code, String url) {
        this.code = code;
        this.url = url;
    }

}
