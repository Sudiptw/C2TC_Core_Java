package technoServe;

import java.util.ArrayList;

public class ArrayListdemo {

	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		l.add("A");
		System.out.println(l);
		l.add(10);
		l.add("B");
		l.add("A");
		l.add(null);
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		l.add(2,"N");
		System.out.println(l);
		
		size(l);
		System.out.println(l+"..");
		
		clear();
		System.out.println(l);
		
		removeAll();
		System.out.println(l);
	}

	private static void removeAll() {
		// TODO Auto-generated method stub
		
	}

	private static void clear() {
		// TODO Auto-generated method stub
		
	}

	private static void size(ArrayList l) {
		// TODO Auto-generated method stub
		
	}

}
