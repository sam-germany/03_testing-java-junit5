package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class OwnerSDJpaServiceTest {

    OwnerSDJpaService service22;

    @BeforeEach
   void setup(){
       service22 = new OwnerSDJpaService(null, null , null);
   }


   @Disabled
    @Test
    void findByLastName() {
     Owner  foundOwner = service22.findByLastName("Buck");
    }

    @Test
    void findAllByLastNameLike() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}
