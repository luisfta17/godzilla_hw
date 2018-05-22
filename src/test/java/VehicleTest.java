import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {
    Godzilla godzilla;
    Vehicle tank;

    @Before
    public void before(){
        godzilla = new Godzilla("Palo", 150, 50);
        tank = new Vehicle("tank", 100, 25);
    }

    @Test
    public void canAttack(){
        godzilla.attack(tank);
        tank.attack(godzilla);
        assertEquals(125, godzilla.getHealthValue());
        assertEquals(50, tank.getHealthValue());
    }
}
