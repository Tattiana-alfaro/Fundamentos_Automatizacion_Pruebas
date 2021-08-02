
import org.testng.Assert;
import org.testng.annotations.Test;

public class main_test_testng {
    @Test(groups = {"Imperio"})
    public void testConsructor(){
        Persona persona = new Persona("Tattiana", "Alfaro");
        Assert.assertEquals(persona.getFullName(), "Tattiana Alfaro");
    }

    @Test(groups = "Republica")
    public void  testChangeName(){
        Persona persona = new Persona("Tattiana", "Alfaro");
        persona.changeName("Tatti");
        Assert.assertEquals(persona.getFullName(), "Tatti Alfaro");
    }


}
