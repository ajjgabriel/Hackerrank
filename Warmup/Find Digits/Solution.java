import java.io.*;
import java.util.*;

class Solution{
    
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int numberOfInput = scan.nextInt();
        for(int i = 0; i < numberOfInput; i++){
            findDigit(scan.next());
        }
    }
    
    private static void findDigit(String inputStr){
        int inputInt = Integer.parseInt(inputStr);
        int countDivisible = 0;
        char[] charArray = inputStr.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            int intDigit = Character.digit(charArray[i],10);
            
            if(intDigit == 0){}
            else if(inputInt % intDigit == 0){
                countDivisible++;
            }
        }
        
        System.out.println(countDivisible);
    }
}