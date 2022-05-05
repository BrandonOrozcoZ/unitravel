package co.edu.uniquindio.unitravel.repositories;

import co.edu.uniquindio.unitravel.entities.Reservation_Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRoomRepository extends JpaRepository<Reservation_Room, Integer> {
}
