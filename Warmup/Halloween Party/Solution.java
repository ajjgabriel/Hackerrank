import java.io.*;
import java.util.*;

class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int numberOfInput = scan.nextInt();
		
		for(int i = 0; i < numberOfInput; i++){
			halloweenParty(scan.nextLong());
		}
	}
	
	private static void halloweenParty(long numberOfCuts) {
		long result = 0;
		if(numberOfCuts % 2 == 0){
			long numberOfVH = numberOfCuts/2;
			result = numberOfVH * numberOfVH;
		}else{
			long numberOfVH = numberOfCuts/2;
			result = numberOfVH * (numberOfVH + 1);
		}
        
        System.out.println(result);
	}
}