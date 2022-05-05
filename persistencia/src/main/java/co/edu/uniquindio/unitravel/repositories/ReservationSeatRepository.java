package co.edu.uniquindio.unitravel.repositories;

import co.edu.uniquindio.unitravel.entities.Reservation_Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationSeatRepository extends JpaRepository<Reservation_Seat, Integer> {
}
