import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
static int lonelyinteger(int[] a, int size) {
        
        if(size == 1){
            return a[0];
        }
    
        Arrays.sort(a);
        boolean same = false;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < size - 1; i++) {
            if(hs.contains(a[i])){
                same = true;
            }else{
                same = false;
                hs.add(a[i]);
            }
            
            if(same == true && a[i] != a[i+1] && size-2 == i){
                return a[i+1];
            }else if(same == false && a[i] != a[i+1]){
                return a[i];
            }
        }
        return 0;
}
    
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a,_a_size);
        System.out.println(res);
        
    }
}
