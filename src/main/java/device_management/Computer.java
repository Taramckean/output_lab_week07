package device_management;

import Behaviours.iOutput;

public class Computer {
    private int ram;
    private int hddSize;

    private Monitor monitor;

    private iOutput outputDevice;

    public Computer(int ram, int hddSize, iOutput outputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;

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
}
