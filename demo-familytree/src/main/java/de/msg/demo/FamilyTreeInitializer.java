package de.msg.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class FamilyTreeInitializer {

    private PersonRepository personRepository;

    public FamilyTreeInitializer(PersonRepository personRepository) {
      this.personRepository = personRepository;
    }

    @PostConstruct
    void initTree() {
        Person p0 = new Person("Rickard", "Stark");
        Person p1 = new Person("Eddard", "Stark");
        Person p2 = new Person("Catelyn", "Tully");
        Person p3 = new Person("Robb", "Stark");
        Person p4 = new Person("Sansa", "Stark");
        Person p5 = new Person("Arya", "Stark");
        Person p6 = new Person("Bran", "Stark");
        Person p7 = new Person("Rickon", "Stark");

        for (Person p : Arrays.asList(p0, p1, p2, p3, p4, p5, p6, p7)) {
            personRepository.save(p);
        }
    }
}
