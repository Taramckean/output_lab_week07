import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {
    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("American");
    }

    @Test
    public void canGetCharacterType(){
        assertEquals("American", keyboard.getCharacterType());
    }

    @Test
    public void canBacklightKeyboard(){
        assertEquals("Keyboard is backlit", keyboard.backlight());
    }

    @Test
    public void canSendData(){
        assertEquals("The keyboard has sent this data", keyboard.sendData("this data"));
    }
}
