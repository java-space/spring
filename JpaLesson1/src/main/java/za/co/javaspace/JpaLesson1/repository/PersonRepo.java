package za.co.javaspace.JpaLesson1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import za.co.javaspace.JpaLesson1.entity.Gender;
import za.co.javaspace.JpaLesson1.entity.Person;

import java.util.List;

public interface PersonRepo extends JpaRepository<Person, Long> {

    <T> List<T> findByLastName(String lastName, Class<T> type);

    //List<NamesOnlyRecord> findNamesOnlyRecord(String firstName);

    List<NamesOnlyDTO> findByFirstName(String firstName);

    @Query("SELECT new za.co.javaspace.JpaLesson1.repository.NamesOnlyDTO(p.firstName, p.lastName) " +
            "FROM Person p " +
            "WHERE p.firstName = :firstName")
    List<NamesOnlyDTO> findAllBy(String firstName);

    @Query("SELECT p.lastName, p.dob, p.gender FROM Person p")
    List<Object[]> getFirstNameDobGender();

    @Query("""
            SELECT
                p.firstName,
                p.lastName
            FROM Person p
            WHERE p.lastName LIKE :lastName
            ORDER BY p.id
            """)
    List<NamesOnly> findByLastName(String lastName);

    List<NamesOnly> findAllByLastName(String lastName);

    List<Person> findAllByGender(Gender gender);

    List<Person> findFirst20ByAddresses_ProvinceContaining(String name);

    @Query("SELECT p FROM #{#entityName} p")
    List<Person> findAllPersons();

    @Query("SELECT p FROM #{#entityName} p")
    List<SpELClosedPropagation> getPersonDescription();

}
