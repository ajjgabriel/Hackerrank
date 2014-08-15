import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static int[] numbers;
	private static int number;
    
    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt(),k=stdin.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) 
            prices[i]=stdin.nextInt();
        sort(prices);
        
        int toyCount = 0;
        while(k > 0){
            k = k - prices[toyCount];
            toyCount++;
        }
        
        int answer = 0;
        // Compute the final answer from n,k,prices 
        System.out.println(toyCount - 1);
    }


	public static void sort(int[] values) {
		// check for empty or null array
		if (values ==null || values.length==0){
			return;
		}
		numbers = values;
		number = values.length;
		quicksort(0, number - 1);
	}

    private static void quicksort(int low, int high) {
    int i = low, j = high;
        
    int pivot = numbers[low + (high-low)/2];

    while (i <= j) {
        
      while (numbers[i] < pivot) {
        i++;
      }
        
      while (numbers[j] > pivot) {
        j--;
      }

      if (i <= j) {
        exchange(i, j);
        i++;
        j--;
      }
    }
        
    if (low < j)
      quicksort(low, j);
    if (i < high)
      quicksort(i, high);
  }

  private static void exchange(int i, int j) {
    int temp = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = temp;
  }
}
