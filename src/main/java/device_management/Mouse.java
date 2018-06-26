package device_management;

import Behaviours.iInput;

public class Mouse implements iInput {
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

        public String sendData(String data) {
            return "The mouse has sent " + data;}
}
