package device_management;

public class Keyboard {
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
}
