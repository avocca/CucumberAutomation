package utilities;

import java.util.Set;

public class Window {
    private static String mainHandle;
    //method for switching to the second window
    public static void switchToTheSecondWindow(){
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        mainHandle = Driver.getDriver().getWindowHandle();
        if(windowHandles.size() < 2){
            System.out.println("No multiple windows found");
        }else{
            for(String windowID: windowHandles){
                if(!windowID.equals(mainHandle)){
                    Driver.getDriver().switchTo().window(windowID);
                }
            }
        }
    }
    //method switches to the main window
    public static void switchToTheMainWindow() {
        if (mainHandle != null) {
            Driver.getDriver().switchTo().window(mainHandle);
        }
    }

    //method for switching to any window, if more than two:
    public static void switchToWindow(String title){
       mainHandle = Driver.getDriver().getWindowHandle();
       Set<String> windowHandles = Driver.getDriver().getWindowHandles();
       if(windowHandles.size() > 2){
           System.out.println("No multiple windows found");
       }else{
           for(String window: windowHandles){
               Driver.getDriver().switchTo().window(window);
               if(title.equals(Driver.getDriver().getTitle())){
                   break;
               }
           }
       }


    }



}
