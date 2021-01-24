package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("model")
class OwnerTest {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1l, "Joe", "Buck");
        owner.setCity("key west");
        owner.setTelephone("123456");

        assertAll("Properties Test",
                          () ->   assertAll("Person Properties",
                                                   ()-> assertEquals("Joe", owner.getFirstName() , "---message"),
                                                   () -> assertEquals("Buck", owner.getLastName())
                          ),

                          () -> assertAll("Owner Properties",
                                                   ()-> assertEquals("key west", owner.getCity(), "---message"),
                                                   () -> assertEquals("123456", owner.getTelephone())
                          )
        );




    }

}
