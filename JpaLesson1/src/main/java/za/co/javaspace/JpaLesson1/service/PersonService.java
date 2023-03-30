package za.co.javaspace.JpaLesson1.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import za.co.javaspace.JpaLesson1.entity.Gender;
import za.co.javaspace.JpaLesson1.repository.PersonRepo;

@Service
@Transactional
@AllArgsConstructor
public class PersonService {

    private PersonRepo personRepo;

    public void update( Gender gender, String firstName) {
        personRepo.updatePerson(gender, firstName);
    }
}
