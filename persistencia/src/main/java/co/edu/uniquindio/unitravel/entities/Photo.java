package co.edu.uniquindio.unitravel.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
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
    private Room roomPhotos;

    public Photo(int code, String url) {
        this.code = code;
        this.url = url;
    }

}
