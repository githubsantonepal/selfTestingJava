package helloworld1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santoshji
 */
public class ReadDateTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar calObj=Calendar.getInstance();
        SimpleDateFormat sdfObj=new SimpleDateFormat("HH:MM:SS");
        System.out.println("The Current time is "+sdfObj.format(calObj.getTime()));
        System.out.println("The time zone "+calObj.getTimeZone());
    }
    
}
