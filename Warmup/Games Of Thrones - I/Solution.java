import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        char[] chars = inputString.toCharArray();
        Arrays.sort(chars);
		int numberOfSameCharacters = 1;
		int numberOfOdds = 0;
		for(int i=0; i < inputString.length() - 1; i++){
			
			if(chars[i] == chars[i+1]){
				numberOfSameCharacters++;
			}else{
				if(numberOfSameCharacters % 2 == 1){
					numberOfOdds++;
				}
				numberOfSameCharacters = 1;
				
			}
		}
		
        String ans = "YES";
        
		if(numberOfOdds > 1){
			ans = "NO";
        }else if(numberOfOdds == 1 && inputString.length() % 2 == 0 ){
			ans = "NO";
		}
		else
			ans = "YES";
			
        System.out.println(ans);
        myScan.close();
    }
}