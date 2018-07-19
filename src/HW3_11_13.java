import java.util.ArrayList;
import java.util.Scanner;

public class HW3_11_13 {

	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		
		//11.11
		System.out.print("Enter 5 numbers: ");
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++) {
			list1.add(s.nextInt());
		}
		
		ArrayListUtils.sort(list1);
		
		for (int i = 0; i <list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();
		
		//11.12
		System.out.print("Enter 5 numbers: ");
		ArrayList<Double> list2 = new ArrayList<Double>();
		
		for(int i = 0; i < 5; i++) {
			list2.add(s.nextDouble());
		}
		
		System.out.println(ArrayListUtils.sum(list2));
		
		//11.13
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		System.out.print("Enter ten integers: ");
		
		for(int i = 0; i < 10; i++) {
			list3.add(s.nextInt());
		}
		
		s.close();
		
		ArrayListUtils.removeDuplicate(list3);
		
		for(int i = 0; i < list3.size(); i++) {
			System.out.print(list3.get(i) + " ");
		}
	}
}
