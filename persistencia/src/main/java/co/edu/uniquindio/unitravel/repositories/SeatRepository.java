package co.edu.uniquindio.unitravel.repositories;

import co.edu.uniquindio.unitravel.entities.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {
}
