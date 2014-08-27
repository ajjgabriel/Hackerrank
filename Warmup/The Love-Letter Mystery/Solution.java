import java.io.*;
import java.util.*;

class Solution{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numberOfInput = scan.nextInt();
        for(int i = 0; i < numberOfInput; i++){
            loveLetterMystery(scan.next());
        }
    }
    
    private static void loveLetterMystery(String inputStr){
        char[] charArray = inputStr.toCharArray();
        int numberOfDecrementalCount = 0;
        int charArrayLength = charArray.length;
        int halfCharArrayLength = charArrayLength/2 + 1;
        for(int i = 0; i < halfCharArrayLength - 1; i++){
            
            while(charArray[i] < charArray[charArrayLength - i -1]){
                
                char c = charArray[charArrayLength-i-1];
                charArray[charArrayLength-i-1] = --c;
                numberOfDecrementalCount++;
            }
            
            while(charArray[i] > charArray[charArrayLength - i -1]){
                
                char c = charArray[charArrayLength-i-1];
                charArray[charArrayLength-i-1] = ++c;
                numberOfDecrementalCount++;
            }
        }
         System.out.println(numberOfDecrementalCount);
    }
    
}