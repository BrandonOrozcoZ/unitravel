package co.edu.uniquindio.unitravel.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.PositiveOrZero;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Hotel implements Serializable {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private int code;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 200, nullable = false)
    private String address;

    @ElementCollection
    @Column(nullable = false)
    private Map<String, String> telephone;

    @PositiveOrZero
    @Column(nullable = false, precision = 1, scale = 1)
    @Min(0) @Max(5)
    private float stars;

    @OneToMany(mappedBy = "hotel")
    @ToString.Exclude
    private List<Room> rooms;

    @OneToMany(mappedBy = "hotelComment")
    @ToString.Exclude
    private List<Comment> comments;

    @OneToMany(mappedBy = "hotelPhotos")
    @ToString.Exclude
    private List<Photo> Photos;

    @ManyToMany(mappedBy = "favorites")
    @ToString.Exclude
    private List<Client> clients;

    @Column(nullable = false)
    private int isFeatured;

    @ManyToOne
    @JoinColumn(nullable = false)
    private City city;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Manager manager;

    @ManyToMany(mappedBy = "hotels")
    @ToString.Exclude
    private List<HotelFeature> features;


    public Hotel(int code, String name, String address, Map<String, String> telephone, float stars, List<Room> rooms, List<Comment> comments, List<Photo> photos, List<Client> clients, City city, Manager manager, List<HotelFeature> features) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.stars = stars;
        this.rooms = rooms;
        this.comments = comments;
        Photos = photos;
        this.clients = clients;
        this.city = city;
        this.manager = manager;
        this.features = features;
    }
}
