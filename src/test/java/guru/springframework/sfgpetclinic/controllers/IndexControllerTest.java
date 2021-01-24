package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Tag("Controllers")
class IndexControllerTest {

    IndexController controller22;

    @BeforeEach
    void setUp() {
        controller22 = new IndexController();
    }

    @DisplayName("----- this name will be shown insted of method() name in the intellij Idea console")
    @Test
    void index() {
        assertEquals("index", controller22.index());
        assertEquals("index", controller22.index(), "Wrong view Returned");
        assertEquals("index", controller22.index(), () -> "Wrong view Returned");
    }

    @Test
    void oupsHandler() {
 //       assertTrue("notimplemented".equals(controller22.oupsHandler()), () -> "This is some expensive Message to build for my test");

     assertThrows( NullPointerException.class, () ->  controller22.oupsHandler());
    }


    @Test
    void testAssumptionTrue() {
        Assumptions.assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
    }
























}
