package co.edu.uniquindio.unitravel.repositories;

import co.edu.uniquindio.unitravel.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
}
