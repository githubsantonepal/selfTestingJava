/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;



/**
 *
 * @author santoshji
 */
public class mortage_calculator {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT=100;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Total Loan you want with Annual Interest Rate and Total Years::");
        int principle=scanner.nextInt();
        float annualInterestRate=scanner.nextFloat();
        byte years=scanner.nextByte();
        float interestPerMonth=annualInterestRate/((MONTHS_IN_YEAR)*(PERCENT));
        int numberInstallment=years*MONTHS_IN_YEAR;
        double mortage=principle*((interestPerMonth*Math.pow((1+interestPerMonth),numberInstallment))/(Math.pow((1+interestPerMonth),numberInstallment)-1));
        System.out.println(" The installment payment is "+NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(mortage));
    }
    
}
