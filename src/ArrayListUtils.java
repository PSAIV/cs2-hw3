import java.util.ArrayList;

public class ArrayListUtils {
	
	public static void sort(ArrayList<Integer> list) {
		list.sort(null);
	}
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
		}
	}
}
