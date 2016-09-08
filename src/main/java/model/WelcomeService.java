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

    public WelcomeService() {
    }    
    
    private DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private Calendar time = Calendar.getInstance();
    
    private int morning = 8;
    private int day = 14;

    private String messageMorning = "Good morning";
    private String messageDay = "Good day";
    private String messageEvening = "Good evening";
    
    /**
     * This method gets the generic time message
     * The message returns the generic time, morning, day, evening, and displays the time
     * @return 
     */
    public String getMessage(){        
        if (0 < time.get(Calendar.HOUR_OF_DAY) && time.get(Calendar.HOUR_OF_DAY) < morning){
            return messageMorning + ", the time is: " + dateFormat.format(time).toString();
        } else if ( morning < time.get(Calendar.HOUR_OF_DAY) && time.get(Calendar.HOUR_OF_DAY) < day){
            return messageDay + ", the time is: " + dateFormat.format(time).toString();
        } else {
            return messageEvening + ", the time is: " + dateFormat.format(time).toString();
        }
    }
    
    /**
     * This method returns a personalized message with the user's name
     * @param name - String name entered in from a form
     * @return 
     */
    public String getPersonalizedMessage (String name){
        if (0 < time.get(Calendar.HOUR_OF_DAY) && time.get(Calendar.HOUR_OF_DAY) < morning){
            return messageMorning + ", " + name;
        } else if ( morning < time.get(Calendar.HOUR_OF_DAY) && time.get(Calendar.HOUR_OF_DAY) < day){
            return messageDay + ", " + name;
        } else {
            return messageEvening + ", " + name;
        }
    }
    
}
