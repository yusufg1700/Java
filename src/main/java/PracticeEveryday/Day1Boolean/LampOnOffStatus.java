package PracticeEveryday.Day1Boolean;

public class LampOnOffStatus {
    public static void main(String[] args) {
        boolean isLightOn=true; //we declare a boolean variable named "isLightOn" and assign it the value "true"
        //this variable represents whether the light is on or off
        if (isLightOn){// we have a conditional statement. this statement checks if "isLightOn" variable holds the value true
            System.out.println("The light is on");//
        }else {
            System.out.println("The Light is off");
        }

        boolean isLightOff=false; //we have a boolean variable called "isLightOff" which is set to false
        String lightStatus= isLightOff ?"on":"off";//we use ternary operator to assgin the value of the "lightStatus" string variable
        System.out.println("the light status is "+lightStatus+".");
    }
}
