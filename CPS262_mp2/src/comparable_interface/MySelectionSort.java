package comparable_interface;

import java.util.ArrayList;

public class MySelectionSort {
	
	public static <T> void sortArray(ArrayList<T> list){
		Student temp;
		for(int i = 0; i < list.size(); i++) {
			for(int j = i; j < list.size(); j++) {
				int value = ((Student) list.get(i)).compareTo((Student) list.get(j));
				if (value == 1) {
					temp = (Student) list.get(j);
					list.set(j, list.get(i));
					list.set(i, (T)temp);
				}
			}
		}
	}
	
	

}
