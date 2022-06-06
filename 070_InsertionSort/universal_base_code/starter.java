import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void insertionSort(int [] arr) {
		int outer, inner, key;
		
		for(outer = 1; outer < arr.length; outer++) {
			key = arr[outer];
			inner = outer-1;
			
			while(inner >= 0 && arr[inner] > key) {
				arr[inner +1] = arr[inner];
				inner = inner -1;
			}
			arr[inner+1] = key;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +", ");
		}
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		
		Random rand = new Random();
		
		int [] array = new int[200];
		
		for(int i = 0; i < 200; i++) {
			array[i] = rand.nextInt(200);
		}
		
		insertionSort(array);

		
	}
}
