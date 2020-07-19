import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat usCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat inCurrencyFormat = NumberFormat.getCurrencyInstance(indiaLocale);

        String us = usCurrencyFormat.format(payment);
        String china = chCurrencyFormat.format(payment);
        String france = frCurrencyFormat.format(payment);
        String india = inCurrencyFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }


}

