package co.edu.uniquindio.unitravel;

import co.edu.uniquindio.unitravel.entities.Client;
import co.edu.uniquindio.unitravel.repositories.ClientRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ClientTest {

    @Autowired
    private ClientRepository clientRepository;

    @Test
    public void register(){

        Client client = new Client("1234", "Brandon", "brandon@gmail.com", "1234567890");
        Client clientSaved = clientRepository.save(client);

        Assertions.assertNotNull(clientSaved);

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void delete(){

        Client client = clientRepository.findById("2435").orElse(null);

        clientRepository.delete(client);

        Client clientDeleted = clientRepository.findById("2435").orElse(null);

        Assertions.assertNull(clientDeleted);

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void update(){

        Client client = clientRepository.findById("2654").orElse(null);
        client.setPassword("5554");

        Client clientUpdated = clientRepository.findById("2654").orElse(null);
        Assertions.assertEquals("5554", clientUpdated.getPassword());

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void list(){

        List<Client> clients = clientRepository.findAll();

        System.out.println(clients);
    }

}
