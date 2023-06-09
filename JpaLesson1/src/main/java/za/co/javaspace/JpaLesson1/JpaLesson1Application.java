package za.co.javaspace.JpaLesson1;

import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import za.co.javaspace.JpaLesson1.entity.Gender;
import za.co.javaspace.JpaLesson1.entity.Person;
import za.co.javaspace.JpaLesson1.repository.PersonRepo;
import za.co.javaspace.JpaLesson1.repository.SpELClosedPropagation;
import za.co.javaspace.JpaLesson1.service.PersonService;

import java.time.LocalDate;
import java.util.*;

@SpringBootApplication
@Transactional
public class JpaLesson1Application {

    public static void main(String[] args) {
        SpringApplication.run(JpaLesson1Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(PersonService personService) {
        return (args) -> {

            //Person p = personRepo.findById(2014098616L).orElseThrow();

            //List<Person> list = personService.findAllByAddresses("KZN");

            //List<Person> list = personService.findAllPersons();

            List<SpELClosedPropagation> list = personService.getPersonDescription();

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).personDescription());
            }


        };
    }

}
