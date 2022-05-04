package co.edu.uniquindio.unitravel.repositories;

import co.edu.uniquindio.unitravel.entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, String> {
}
