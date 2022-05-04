package co.edu.uniquindio.unitravel;

import co.edu.uniquindio.unitravel.entities.Manager;
import co.edu.uniquindio.unitravel.repositories.ManagerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ManagerTest {

    @Autowired
    private ManagerRepository managerRepository;

    @Test
    public void register(){

        Manager manager = new Manager("5678", "Manager1", "manager1@gmail.com", "manager1123");
        Manager managerSaved = managerRepository.save(manager);

        Assertions.assertNotNull(managerSaved);

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void delete(){

        Manager manager = managerRepository.findById("4895").orElse(null);

        managerRepository.delete(manager);

        Manager managerDeleted = managerRepository.findById("4895").orElse(null);

        Assertions.assertNull(managerDeleted);

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void update(){

        Manager manager = managerRepository.findById("4098").orElse(null);
        manager.setName("Manager7");

        Manager managerUpdated = managerRepository.findById("4098").orElse(null);
        Assertions.assertEquals("Manager7", managerUpdated.getName());

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void list(){

        List<Manager> managers = managerRepository.findAll();

        System.out.println(managers);

    }

}
