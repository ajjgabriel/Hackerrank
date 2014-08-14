import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.HashSet;


public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int numberOfInput = myScan.nextInt();
       
		HashSet<String> hs = new HashSet<String>();
        HashSet<String> hs2 = new HashSet<String>();
		int firstEntry = 0;
	    while(numberOfInput > 0){
		
			String inputString = myScan.next();
			char[] newChars = inputString.toCharArray();
			if(firstEntry == 0){
				for(int i = 0; i < inputString.length(); i++){
					hs.add(newChars[i] + "");
                    
				}
				
			}else{
				for(int i = 0; i < inputString.length(); i++){
					if(hs.contains(newChars[i] + "")){
						hs2.add(newChars[i] + "");
					}
				}
                
                hs.clear();
                hs = (HashSet)hs2.clone();
                hs2.clear();
			}
			
			numberOfInput--;
			firstEntry = 1;
		}
		
        System.out.println(hs.size());
        myScan.close();
    }
}