import java.io.*;
import java.util.*;

class Solution{
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int inputNumber = in.nextInt();
        int[] numbers = new int[inputNumber];
        for(int i=0; i< inputNumber;i++){
            numbers[i] = in.nextInt();
            
        }
        insertionSort(numbers);
        
    }
    
    private static void insertionSort(int[] arr) {
        int count = 0;
		for (int i = 1; i < arr.length; i++) {
			int valueToSort = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > valueToSort) {
				arr[j] = arr[j - 1];
				j--;
                count++;
			}
			arr[j] = valueToSort;
		}
        System.out.println(count);
	}
    
}