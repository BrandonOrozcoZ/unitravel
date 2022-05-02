package co.edu.uniquindio.unitravel.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Bedroom implements Serializable {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private int number;

    @Column(nullable = false, scale = 2)
    @Positive
    private float price;

    @Column(nullable = false)
    @Positive
    private int capacity;

    @OneToMany(mappedBy = "bedroomPhotos")
    private List<Photo> photos;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Hotel hotel;

    @ManyToMany(mappedBy = "roomsFeatures")
    private List<RoomFeature> features;

    @ManyToMany(mappedBy = "bedrooms")
    private List<Bed> beds;

    @ManyToMany(mappedBy = "reservedBedrooms")
    private List<Reservation> reservations;

    public Bedroom(int number, float price, int capacity, List<Photo> photos, Hotel hotel, List<RoomFeature> features, List<Bed> beds) {
        this.number = number;
        this.price = price;
        this.capacity = capacity;
        this.photos = photos;
        this.hotel = hotel;
        this.features = features;
        this.beds = beds;
    }
}
