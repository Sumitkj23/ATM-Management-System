/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Random;

/**
 *
 * @author Sumit Kumar
 */
public class getRandomNumber {
    
    
    // generate 4 digit code in string format
    public static String generate4DigitCode()
    {
        String str;     // stores 4 digit code in string format
        
        int n , c = 0;
        
        Random r = new Random();
        n = r.nextInt(9999)+1;      // stores any random number
        
        String s = Integer.toString(n);     // convert into String
        
        while(n != 0)       // count digit in generated random number
        {
            n/=10;
            c++;
        }
        
        switch (c)      // make 4 digit random number and store into String "str"
        {
            case 0:
                str = "9090";        // add 0s to make 4 digit number
                break;
            case 1:
                str = s+ "020";
                break;
            case 2:
                str = s + "00";
                break;
            case 3:
                str = s + "0";
                break;
            default:
                str = s;
        }
        
        return str;
    }
    
}
