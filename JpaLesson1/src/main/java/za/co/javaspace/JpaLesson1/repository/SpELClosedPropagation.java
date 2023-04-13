package za.co.javaspace.JpaLesson1.repository;

import org.springframework.beans.factory.annotation.Value;

public interface SpELClosedPropagation {

    @Value("#{target.firstName + ' ' + target.lastName}")
    String personDescription();
}
