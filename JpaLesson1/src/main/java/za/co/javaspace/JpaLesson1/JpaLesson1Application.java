package za.co.javaspace.JpaLesson1;

import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import za.co.javaspace.JpaLesson1.entity.Gender;
import za.co.javaspace.JpaLesson1.entity.Person;
import za.co.javaspace.JpaLesson1.repository.PersonRepo;
import za.co.javaspace.JpaLesson1.service.PersonService;

import java.time.LocalDate;

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

            personService.update(Gender.MALE, "Test; 'DELETE FROM Person p'");
        };
    }

}
