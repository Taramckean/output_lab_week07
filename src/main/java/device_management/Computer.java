package device_management;

import Behaviours.iInput;
import Behaviours.iOutput;

public class Computer {
    private int ram;
    private int hddSize;

    private Monitor monitor;

    private iOutput outputDevice;

    private iInput inputDevice;

    public Computer(int ram, int hddSize, iOutput outputDevice, iInput inputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.inputDevice = inputDevice;

    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public iOutput getOutputDevice() {
        return this.outputDevice;
    }

    public void setOutputDevice(iOutput outputDevice) {
        this.outputDevice = outputDevice;
    }

    public String outputData(String data) {
        return this.outputDevice.outputData(data);
    }

   public String inputData(String data) {
        return this.inputDevice.sendData(data);}
    }

