/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld1;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author santoshji
 */
public class Number_format_currency {    
    public static void main(String[] args) {

        int val = 23_500;

        NumberFormat cf1 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        System.out.println(cf1.format(val));

        NumberFormat cf2 = NumberFormat.getCurrencyInstance(new Locale("sk", "SK"));
        System.out.println(cf2.format(val));  
        
        NumberFormat cf3 = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        System.out.println(cf3.format(val));         
    }
    
}