import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void selectionSort(int [] arr) {
		int outer, inner, min_index;
		
		for(outer = 0; outer < arr.length; outer++) {
			min_index = outer;
			for(inner = outer+1; inner < arr.length; inner++) {
				if(arr[inner] < arr[min_index]) {
					min_index = inner;
				}
			}
			int temp = arr[outer];
			arr[outer] = arr[min_index];
			arr[min_index] = temp;
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
		
		selectionSort(array);


		
	}
}
