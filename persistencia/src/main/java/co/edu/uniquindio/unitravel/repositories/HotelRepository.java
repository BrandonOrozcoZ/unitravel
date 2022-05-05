package co.edu.uniquindio.unitravel.repositories;

import co.edu.uniquindio.unitravel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
