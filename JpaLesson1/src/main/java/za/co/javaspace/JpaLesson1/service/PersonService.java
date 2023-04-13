package za.co.javaspace.JpaLesson1.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import za.co.javaspace.JpaLesson1.entity.Person;
import za.co.javaspace.JpaLesson1.repository.NamesOnly;
import za.co.javaspace.JpaLesson1.repository.PersonRepo;
import za.co.javaspace.JpaLesson1.repository.SpELClosedPropagation;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class PersonService {

    private PersonRepo personRepo;
    //private GenericPersonRepo genericPersonRepo;

    public List<Person> findAllByAddresses(String province) {
        return personRepo.findFirst20ByAddresses_ProvinceContaining(province);
    }

    public void test() {
        List<Person> persons =
                personRepo.findByLastName("Matthews", Person.class);

        List<NamesOnly> namesOnlies =
                personRepo.findByLastName("Matthews", NamesOnly.class);
    }


    public List<Person> findAllPersons() {
        return personRepo.findAllPersons();
    }

//    public List<Person> findAllGPersons() {
//        return genericPersonRepo.findAllPersons();
//    }

    public List<SpELClosedPropagation> getPersonDescription () {
        return personRepo.getPersonDescription();
    }
}
