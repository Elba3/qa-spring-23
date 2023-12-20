import model.Cat;
import model.Chair;
import model.Table;
import model.User;
import org.junit.jupiter.api.Test;

public class TestMetods {
    @Test
    public void creatingTestMetods() {
        Cat sima = new Cat();
        sima.setName("Simash");
        sima.setBreed("Oriental");
        sima.setAge(2);
        sima.setColor("Black");
        sima.setLength(90);
        sima.setWeight(5);
        sima.setWidth(1.55);

        Cat mars = new Cat();
        mars.setName("Mars");
        mars.setBreed("Burma");
        mars.setAge(1);
        mars.setColor("Chocolate");
        mars.setLength(50);
        mars.setWeight(7);
        mars.setWidth(1);

        mars.printNameBreed();
        System.out.println(sima.getColor()+ " " + sima.getBreed());

      User lola= new User();
      lola.setFirstName("Lolita");
      lola.setLastName("Himki");
      lola.setAge(30);
      lola.setEmail("lola@lita.lv");
      lola.setPhoneNumber("+37129872222");

     User ken = new User();
     ken.setFirstName("Kentavr");
     ken.setLastName("Aria");
     ken.setAge(27);
     ken.setEmail("ken@tavr.lv");
     ken.setPhoneNumber("29999999999");

        System.out.println(lola.getFirstName()+ ken.getFirstName());
        lola.printFullName();
        ken.printFullName();

        Chair omra = new Chair();
        omra.setHeight(150);
        omra.setLength(50);
        omra.setMaterial("Wood");
        omra.setWidth(66);
        omra.setColor("White");

       Chair umka = new Chair();
       umka.setHeight(178);
       umka.setLength(55);
       umka.setMaterial("Plastic");
       umka.setWidth(70);
       umka.setColor("Purple");

        umka.printMaterialColor();
        omra.printMaterialColor();






    }
}
