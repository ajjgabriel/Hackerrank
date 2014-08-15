import java.util.*;
import java.io.*;
class Solution{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int numberOfInput = scan.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i < numberOfInput; i++){
            int numberInput = scan.nextInt();
            if(hm.containsKey(numberInput)){
                hm.put(numberInput, hm.get(numberInput) + 1);
            }else{
                hm.put(numberInput, 1);
            }
            scan.next();
        }
        
        int resultValue =0;
        for(int i =0; i < 100; i++){
            if(hm.containsKey(i)){
                resultValue = resultValue + hm.get(i);
                System.out.print(resultValue + " ");
            }else{
                System.out.print(resultValue + " ");
            }
        }
        
    }
}