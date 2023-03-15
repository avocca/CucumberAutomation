package utilities;

import org.openqa.selenium.interactions.Actions;

public class Flow {
    //create a static method waits and uses Thread.sleep with Exception Handled
    //Flow.wait(500);  --> needs to wait 5 seconds
    public static void wait(int milliseconds){
        try{
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Interruption happened");
        }
 }

    public static void scrollDown(int deltaY){
        Actions action = new Actions(Driver.getDriver());
        action.scrollByAmount(0, deltaY).perform();
}

    public static void scrollUp(int deltaY){
        Actions action = new Actions(Driver.getDriver());
        action.scrollByAmount(0, -deltaY).perform();
    }














}
