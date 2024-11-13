package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCollection {

	public static void main(String[] args) {
		 String[] a = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		 
		 List<String> list = new ArrayList<String>();
		 
		 for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		 Collections.sort(list);
		 System.out.println(list);
		 
		 for (int i = (a.length)-1; i>-1; i--) {
			System.out.println(list.get(i));
		}

	}

}
