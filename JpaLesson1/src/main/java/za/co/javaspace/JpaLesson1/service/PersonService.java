package za.co.javaspace.JpaLesson1.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import za.co.javaspace.JpaLesson1.entity.Gender;
import za.co.javaspace.JpaLesson1.entity.Person;
import za.co.javaspace.JpaLesson1.repository.PersonRepo;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class PersonService {

    private PersonRepo personRepo;

    public List<Person> findAllByAddresses(String province) {
     return personRepo.findBy(province);
    }
}
