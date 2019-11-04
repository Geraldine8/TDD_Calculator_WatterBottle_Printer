import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void getVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrink(){
        assertEquals(90, waterBottle.canDrink());
    }

    @Test
    public void canEmpty(){
        assertEquals(0, waterBottle.canEmpty());
    }

    @Test
    public void canFill(){
        this.waterBottle.canEmpty();
        assertEquals(100, waterBottle.canFill());
    }


}
