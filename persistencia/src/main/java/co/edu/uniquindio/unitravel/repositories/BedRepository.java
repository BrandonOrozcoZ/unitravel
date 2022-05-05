package co.edu.uniquindio.unitravel.repositories;

import co.edu.uniquindio.unitravel.entities.Bed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedRepository extends JpaRepository<Bed, Integer> {
}
