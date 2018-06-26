package device_management;

public class Television extends VideoDevice {
    public Television(int screenSize, int pixels) {
        super(screenSize, pixels);
    }

    public String tune(String station) {
      return "tuning to: " + station;
    };

    public static class Mouse {
        private String type;
        private int buttonNumber;

        public Mouse(String type, int buttonNumber){
            this.type = type;
            this.buttonNumber = buttonNumber;
        }


        public String getType() {
            return this.type;
        }

        public int getButtonNumber() {
            return this.buttonNumber;
        }

        public String move() {
            return "device_management.Television.Mouse is moving";
        }


        public String click() {
            return "device_management.Television.Mouse is clicking";
        }
    }
}
