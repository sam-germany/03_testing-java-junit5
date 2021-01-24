package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {
        Person person = new Person(1l, "Joe", "sam");

        assertAll("Test Props Set---", () -> assertEquals("Joe", person.getFirstName()),
                                               () -> assertEquals("sam", person.getLastName())
                 );
    }

    @Test
    void groupedAssertions2() {
        Person person = new Person(1l, "Sunny", "singh");

        assertAll("Test Props Set---", () -> assertEquals("Joe", person.getFirstName(), "----message"),
                                               () -> assertEquals("sam", person.getLastName(), "----message")
        );
    }



}
