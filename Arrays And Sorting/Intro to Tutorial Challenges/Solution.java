import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int intToBeFound = in.nextInt();
       int s = in.nextInt();
        
       for(int i=0;i<s;i++){
           if(in.nextInt() == intToBeFound){
               System.out.println(i);
           }
       }          
    }    
}
