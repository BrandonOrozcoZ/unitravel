package co.edu.uniquindio.unitravel.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Room implements Serializable {

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

    @OneToMany(mappedBy = "roomPhotos")
    @ToString.Exclude
    private List<Photo> photos;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Hotel hotel;

    @ManyToMany(mappedBy = "roomsFeatures")
    @ToString.Exclude
    private List<RoomFeature> features;

    @ManyToMany(mappedBy = "rooms")
    @ToString.Exclude
    private List<Bed> beds;

    @OneToMany(mappedBy = "room")
    @ToString.Exclude
    private List<Reservation_Room> reservations;

    public Room(int number, float price, int capacity, List<Photo> photos, Hotel hotel, List<RoomFeature> features, List<Bed> beds) {
        this.number = number;
        this.price = price;
        this.capacity = capacity;
        this.photos = photos;
        this.hotel = hotel;
        this.features = features;
        this.beds = beds;
    }
}
