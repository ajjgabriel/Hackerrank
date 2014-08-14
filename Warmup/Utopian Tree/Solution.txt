import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;


public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int numberOfInput = myScan.nextInt();
       
	    while(numberOfInput > 0){
		
			int numberOfCycle  = myScan.nextInt() + 1;
			int height = 0;
			for(int i = 0; i < numberOfCycle; i++){
				if(i%2 == 0){
					height = height + 1;
				}else{
					height = height*2;
				}
			}
			System.out.println(height);
			numberOfInput--;
			
		}
		
        myScan.close();
    }
}