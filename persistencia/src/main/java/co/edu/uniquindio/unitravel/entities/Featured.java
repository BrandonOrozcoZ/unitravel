package co.edu.uniquindio.unitravel.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Featured implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @OneToOne
    private Hotel hotelFeatured;

    public Featured(Hotel hotelFeatured) {
        this.hotelFeatured = hotelFeatured;
    }
}
