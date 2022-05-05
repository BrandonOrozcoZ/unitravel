package co.edu.uniquindio.unitravel.repositories;

import co.edu.uniquindio.unitravel.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
