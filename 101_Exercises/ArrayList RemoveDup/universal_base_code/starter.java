//import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		removeDup(arr1);		//Create this method.
		System.out.println();
		System.out.println();
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*100)));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void removeDup(ArrayList<Integer> arr){
		for(int a = 0; a < arr.size(); a++){
			for(int b = a+1; b < arr.size(); b++){
				if(arr.get(a) == arr.get(b)) {
					arr.remove(b);
					b--;;
				}
			}
		}
	}
}
