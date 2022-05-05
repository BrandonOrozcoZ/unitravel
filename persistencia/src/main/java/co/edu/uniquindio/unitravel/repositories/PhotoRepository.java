package co.edu.uniquindio.unitravel.repositories;

import co.edu.uniquindio.unitravel.entities.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Integer> {
}
