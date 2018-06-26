import device_management.Mouse;
import device_management.Television;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {
   Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse("Wireless", 2);
    }

    @Test
    public void canGetType(){
        assertEquals("Wireless", mouse.getType());
    }

    @Test
    public void canGetButtonNumber(){
        assertEquals(2, mouse.getButtonNumber());
    }

    @Test
    public void canMove(){
        assertEquals("device_management.Television.Mouse is moving", mouse.move());
    }

    @Test
    public void canClick(){
        assertEquals("device_management.Television.Mouse is clicking", mouse.click());
    }

    @Test
    public void canSendData(){
        assertEquals("The mouse has sent this data", mouse.sendData("this data"));
    }
}
