import java.util.*;
import java.io.*;
class Solution{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int numberOfInput = scan.nextInt();
        scan.nextLine();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        String[] arrayInt = scan.nextLine().split(" ");
        int arraylength =  arrayInt.length;
        for(int i=0; i < arraylength; i++){
            int numberInput = Integer.parseInt(arrayInt[i]);
            if(hm.containsKey(numberInput)){
                hm.put(numberInput, hm.get(numberInput) + 1);
            }else{
                hm.put(numberInput, 1);
            }
        }
        
        int resultValue =0;
        for(int i =0; i < 100; i++){
            if(hm.containsKey(i)){
                resultValue = resultValue + hm.get(i);
                System.out.print(resultValue + " ");
            }else{
                System.out.print(0 + " ");
            }
            resultValue =0;
        }
        
    }
}