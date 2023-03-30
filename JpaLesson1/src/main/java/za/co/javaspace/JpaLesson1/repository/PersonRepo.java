package za.co.javaspace.JpaLesson1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import za.co.javaspace.JpaLesson1.entity.Person;

import java.util.List;

public interface PersonRepo extends JpaRepository<Person, Long> {


    @Query("FROM Person p WHERE p.firstName = :firstName")
    List<Person> findBy(@Param("firstName") String name);

}
