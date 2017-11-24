package de.msg.demo;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void createGeneratesId() {
        // when
        Person saved = personRepository.save(new Person());

        // then
        assertNotNull(saved);
        assertNotNull(saved.getId());
    }

    @Test
    public void findOneReturnsEntity() {
        // given
        Person person = new Person();
        person.setFirstName("firstName");
        person.setLastName("lastName");

        Long id = personRepository.save(person).getId();

        // when
        Person result = personRepository.findOne(id);

        // then
        assertNotNull(result);
        assertEquals(id, result.getId());
        assertEquals("firstName", result.getFirstName());
        assertEquals("lastName", result.getLastName());
    }
}
