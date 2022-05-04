package co.edu.uniquindio.unitravel;

import co.edu.uniquindio.unitravel.entities.Administrator;
import co.edu.uniquindio.unitravel.repositories.AdministratorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AdministratorTest {

    @Autowired
    private AdministratorRepository adminRepository;

    @Test
    public void register(){

        Administrator admin = new Administrator("3000", "Admin4", "admin4@gmail.com", "admin4123");
        Administrator adminSaved = adminRepository.save(admin);

        Assertions.assertNotNull(adminSaved);

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void delete(){

        Administrator admin = adminRepository.findById("3654").orElse(null);

        adminRepository.delete(admin);

        Administrator admindeleted = adminRepository.findById("3654").orElse(null);

        Assertions.assertNull(admindeleted);

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void update(){

        Administrator admin = adminRepository.findById("3124").orElse(null);
        admin.setEmail("Admin2123@gmail.com");

       Administrator adminUpdated = adminRepository.findById("3124").orElse(null);
       Assertions.assertEquals("Admin2123@gmail.com", adminUpdated.getEmail());


    }

    @Test
    @Sql("classpath:dataset.sql")
    public void list(){

        List<Administrator> administrators = adminRepository.findAll();

        System.out.println(administrators);

    }

}
