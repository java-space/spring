package za.co.javaspace.JpaLesson1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import za.co.javaspace.JpaLesson1.entity.Gender;
import za.co.javaspace.JpaLesson1.entity.Person;
import za.co.javaspace.JpaLesson1.repository.PersonRepo;

import java.time.LocalDate;

@SpringBootApplication
public class JpaLesson1Application {

    public static void main(String[] args) {
        SpringApplication.run(JpaLesson1Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(PersonRepo personRepo) {
        return (args) -> {

            Person p = personRepo.findById(2014098616L).orElseThrow();

            Person p1 = new Person();
            p1.setId(1L);
            p1.setFirstName("Test");
            p1.setLastName("Test");
            p1.setDob(LocalDate.now());
            p1.setGender(Gender.MALE);
            personRepo.save(p1);
        };
    }

}
