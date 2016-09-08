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
    
    public String getMessage(){        
        if (0 < time.get(Calendar.HOUR_OF_DAY) && time.get(Calendar.HOUR_OF_DAY) < morning){
            return messageMorning + ", the time is: " + dateFormat.format(time);
        } else if ( morning < time.get(Calendar.HOUR_OF_DAY) && time.get(Calendar.HOUR_OF_DAY) < day){
            return messageDay + ", the time is: " + dateFormat.format(time);
        } else {
            return messageEvening + ", the time is: " + dateFormat.format(time);
        }
    }
    
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
