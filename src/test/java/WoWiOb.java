import model.Student2;
import org.junit.jupiter.api.Test;

public class WoWiOb {
    @Test
    public void creatingAndUsingObjects() {
       Student2 dima = new Student2();
       dima.setFirstName("Dmitry");
       dima.setLastName("Tester");
       dima.setEmail("test@test.lv");
       dima.setAge(81);

       Student2 misha = new Student2();
       misha.setFirstName("Mihailina");
       misha.setLastName("Trololo");
       misha.setEmail("trololo@misha.lv");
       misha.setAge(18);

       System.out.println(misha.getFirstName());
        System.out.println(misha.getLastName());

    }
}
