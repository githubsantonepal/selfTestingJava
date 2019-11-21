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
public class Number_format_percentage {
    public static void main(String [] args){
        double y=(25F/100F);
        NumberFormat pf=NumberFormat.getPercentInstance();
        System.out.println(pf.format(y));                
    }
    
    
}
