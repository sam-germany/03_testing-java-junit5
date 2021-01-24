package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("model")
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

    @RepeatedTest(10)
    @Test
    void myTepeatedTest() {

    }


}
