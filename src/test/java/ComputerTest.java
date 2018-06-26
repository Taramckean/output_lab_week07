import Behaviours.iOutput;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Mouse mouse;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        computer = new Computer(8, 512, monitor, mouse);
        mouse = new Mouse("Wireless", 2);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

    @Test
    public void hasOutputDevice() {
        iOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }


    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter(){
        Printer printer = new Printer("Epsom", "Stylus", 120, 4);
        computer = new Computer( 8, 512, printer, mouse);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaSpeaker(){
        Speaker speaker = new Speaker(100);
        Computer computer = new Computer(8, 512, speaker, mouse);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canUpdateOutputDevice(){
        Speaker speaker = new Speaker(100);
        Computer computer = new Computer(8, 512, speaker, mouse);
        Printer printer = new Printer("Epsom", "Stylus", 512, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canInputDataViaMouse(){
        Mouse mouse = new Mouse("Wireless", 2);
        Speaker speaker = new Speaker(100);
        Computer computer = new Computer(8, 512, speaker, mouse);
        assertEquals("The mouse has sent some data", computer.inputData("some data"));
    }
}
