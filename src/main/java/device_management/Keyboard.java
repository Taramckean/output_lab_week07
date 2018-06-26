package device_management;

import Behaviours.iInput;

public class Keyboard implements iInput {
    private String characterType;

    public Keyboard(String characterType){
        this.characterType = characterType;
    }

    public String getCharacterType() {
        return this.characterType;
    }

    public String backlight() {
        return "Keyboard is backlit";
    }
    public String sendData(String data) {
        return "The keyboard has sent " + data;}
}
