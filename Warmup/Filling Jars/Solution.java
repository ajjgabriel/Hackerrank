import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;

public class Solution {


    static void solveMeFirst(int _jar, int _operations, Scanner in) {
        
       
        long totalValue = 0;
        for(int i = 0; i < _operations; i++){
            long firstIndex = in.nextLong();
            long secondIndex = in.nextLong();
            long number = in.nextLong();
            totalValue = totalValue + (number * (secondIndex - firstIndex + 1)) ;
		}
        
        System.out.println(totalValue/_jar);
        
   }

   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _jar;
        _jar = in.nextInt();
        int _operations;
        _operations = in.nextInt();
        solveMeFirst(_jar, _operations, in);
   }
}