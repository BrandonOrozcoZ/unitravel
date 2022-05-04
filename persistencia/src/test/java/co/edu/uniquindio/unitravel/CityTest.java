package co.edu.uniquindio.unitravel;

import co.edu.uniquindio.unitravel.entities.City;
import co.edu.uniquindio.unitravel.repositories.CityRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CityTest {

    @Autowired
    private CityRepository cityRepository;

    @Test
    public void create(){

        City city = new City(1555, "Bucaramanga");
        City citySaved = cityRepository.save(city);

        Assertions.assertNotNull(citySaved);

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void delete(){

        City city = cityRepository.findById(1222).orElse(null);

        cityRepository.delete(city);

        City cityDeleted = cityRepository.findById(1222).orElse(null);

        Assertions.assertNull(cityDeleted);

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void update(){

        City city = cityRepository.findById(1333).orElse(null);
        city.setName("Pereira");

        City cityUpdated = cityRepository.findById(1333).orElse(null);

        Assertions.assertEquals("Pereira", cityUpdated.getName());

    }

    @Test
    @Sql("classpath:dataset.sql")
    public void list(){

        List<City> cities = cityRepository.findAll();

        System.out.println(cities);

    }
}
