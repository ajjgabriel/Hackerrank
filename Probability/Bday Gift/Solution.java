import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.DecimalFormat;

public class Solution {

      
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _a = in.nextInt();
		double sumOfResult = 0;
        for(int i =0; i < _a; i++){
            double _b = in.nextDouble();
			sumOfResult = sumOfResult + _b;
        }
        DecimalFormat df = new DecimalFormat(".#");
		System.out.println(df.format(sumOfResult/2));
        
   }
}