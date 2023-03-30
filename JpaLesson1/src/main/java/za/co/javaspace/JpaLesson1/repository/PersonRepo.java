package za.co.javaspace.JpaLesson1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import za.co.javaspace.JpaLesson1.entity.Gender;
import za.co.javaspace.JpaLesson1.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

    @Query("UPDATE Person p SET p.gender = :gender WHERE p.firstName = :firstName")
    void updatePerson(String firstName, Gender gender);
}
