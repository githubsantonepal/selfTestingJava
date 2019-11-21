/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld1;

import java.text.NumberFormat;

/**
 *
 * @author santoshji
 */
public class Number_format_comma {
    public static void main(String[] args){
        double n=1234566;
        NumberFormat pf= NumberFormat.getInstance();
        System.out.println("The value is::"+pf.format(n));
    }
    
}
