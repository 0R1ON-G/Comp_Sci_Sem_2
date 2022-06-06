import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void bubbleSort(int [] arr) {
	for(int outer = 0; outer < arr.length-1; outer++) {
		for(int inner = 0; inner <arr.length-outer-1; inner++) {
			if(arr[inner] > arr[inner+1]){
				int temp = arr[inner];
				arr[inner] = arr[inner+1];
				arr[inner+1] = temp;
			}
			
		}
	}
	
	for(int i = 0; i <arr.length; i++) {
		System.out.print(arr[i] +", ");
	}
}
	public static void main(String args[]) {
		Random rand = new Random();
		int[] array = new int[200];
		
		for(int i = 0; i < 200; i++) {
			array[i] = rand.nextInt(99)+1;
		}
		
		bubbleSort(array);
	
	

		
	}
}
