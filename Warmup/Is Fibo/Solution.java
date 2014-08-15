import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;

public class Solution {

   
    public static boolean fibonacci(double number) {
      
	  double calculatebase = 5 * number * number;
	  double calculateCeil = calculatebase + 4;
	  double calculateFloor = calculatebase - 4;
        
	  if((Math.sqrt(calculateCeil)) % 1 == 0 || (Math.sqrt(calculateFloor)) % 1 == 0 ){
		return true;
	  }else{
		return false;
	  }
	  
   }

   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _a = in.nextInt();
		double _b = 0;
        for(int i =0; i < _a; i++){
            _b = in.nextDouble();
            if(fibonacci(_b)){
				System.out.println("IsFibo");
			}else{
				System.out.println("IsNotFibo");
			}
        }
        
   }
}