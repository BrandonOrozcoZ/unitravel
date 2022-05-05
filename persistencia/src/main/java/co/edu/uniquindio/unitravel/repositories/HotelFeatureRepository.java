package co.edu.uniquindio.unitravel.repositories;

import co.edu.uniquindio.unitravel.entities.HotelFeature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelFeatureRepository extends JpaRepository<HotelFeature, Integer> {
}
