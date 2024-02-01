package oops.part3;

import java.util.ArrayList;

public class Collection_ArrayList {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("harsha");
		a.add("anu");
		System.out.println(a);
		a.add(0, "anju");
		a.add(1, "gopika");
		a.add(4, "nila");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		System.out.println(a.get(3));
		System.out.println(a.contains("nila"));
		System.out.println(a.contains("test"));
		

	}

}
