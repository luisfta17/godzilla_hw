import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GodzillaTest {
    Godzilla godzilla;
    Godzilla miniGodzilla;

    @Before
    public void before(){
        godzilla = new Godzilla("Palo", 150, 50);
        miniGodzilla = new Godzilla("godzillita", 100, 50);
    }

    @Test
    public void hasHealth(){
        assertEquals(150, godzilla.getHealthValue());
    }
    @Test
    public void canRoar(){
        assertEquals("Palo Roarsss!", godzilla.roar());
    }
    @Test
    public void canAttack(){
        godzilla.attack(miniGodzilla);
        godzilla.attack(miniGodzilla);
        assertEquals(0, miniGodzilla.getHealthValue());
    }
}
