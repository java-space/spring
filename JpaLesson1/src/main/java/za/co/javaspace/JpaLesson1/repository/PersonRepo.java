package za.co.javaspace.JpaLesson1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import za.co.javaspace.JpaLesson1.entity.Gender;
import za.co.javaspace.JpaLesson1.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

    @Modifying
    @Query(value = "UPDATE Person p SET p.gender= ?1 WHERE p.firstName = ?2")
    void updatePerson(Gender gender, String firstName);

}
