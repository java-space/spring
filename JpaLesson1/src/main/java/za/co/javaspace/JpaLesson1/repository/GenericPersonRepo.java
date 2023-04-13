//package za.co.javaspace.JpaLesson1.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import za.co.javaspace.JpaLesson1.entity.Person;
//
//import java.util.List;
//
//public interface GenericPersonRepo<T> extends JpaRepository<T, Long> {
//
//    @Query("SELECT p FROM #{#entityName} p")
//    List<Person> findAllPersons();
//}
