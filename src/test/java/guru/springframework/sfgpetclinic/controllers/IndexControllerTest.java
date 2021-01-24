package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    IndexController controller22;

    @BeforeEach
    void setUp() {
        controller22 = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", controller22.index());
        assertEquals("index", controller22.index(), "Wrong view Returned");
        assertEquals("index", controller22.index(), () -> "Wrong view Returned");
    }

    @Test
    void oupsHandler() {
        assertTrue("notimplemented".equals(controller22.oupsHandler()), () -> "This is some expensive Message to build for my test");
    }
}
