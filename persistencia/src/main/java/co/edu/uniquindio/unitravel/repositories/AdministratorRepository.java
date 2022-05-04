package co.edu.uniquindio.unitravel.repositories;

import co.edu.uniquindio.unitravel.entities.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, String> {
}
