package nl.martinvw.test;

import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class PersonTest {
    @Test
    public void testHappyFlow() {
        Person samuel = new Person();
        samuel.setName("Samuel Antequera");
        Job programmer = new Job();

        programmer.setName("fds");
        programmer.setSalary(18000);
        samuel.setJob(programmer);

        validatePerson(samuel);
    }

    @Test(expected = BusinessServiceException.class)
    public void testJobNameNull() {
        Person samuel = new Person();
        samuel.setName("Samuel Antequera");
        Job programmer = new Job();

        programmer.setSalary(18000);
        samuel.setJob(programmer);

        validatePerson(samuel);
    }

    public void validatePerson(Person in) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Person>> violations = validator.validate(in);
        for (ConstraintViolation<Person> violation : violations) {
            throw new BusinessServiceException(violation.getMessage(), violation.getPropertyPath().toString());
        }
    }
}