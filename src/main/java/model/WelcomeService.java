/*
 * 
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author David Arnell
 */
public class WelcomeService {

    private DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private Calendar time = Calendar.getInstance();

    private String messageMorning = "Good morning!";
    private String messageDay = "Good day!";
    private String messageEvening = "Good evening!";
    
    private String GetMessage(){
        
        return "";
    }
    
}
