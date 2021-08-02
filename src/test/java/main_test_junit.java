import org.junit.Assert;
import org.junit.Test;

public class main_test_junit {

    @Test
    public void testConsructor(){
        Persona persona = new Persona("Tattiana", "Alfaro");
        Assert.assertEquals("Tattiana Alfaro", persona.getFullName());
    }

    @Test
    public void  testChangeName(){
        Persona persona = new Persona("Tattiana", "Alfaro");
        persona.changeName("Tatti");
        Assert.assertEquals("Tatti Alfaro", persona.getFullName());
    }
}
