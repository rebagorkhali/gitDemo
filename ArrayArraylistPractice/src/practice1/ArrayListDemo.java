package practice1;

import java.util.ArrayList; // package

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
			System.out.println(a1);
		a1.add(70);
		a1.add(80);
			System.out.println(a1);
		a1.set(0, 32);
			System.out.println(a1);
		a1.remove(3);
			System.out.println(a1);
		a1.clear();
			System.out.println(a1);

	}

}
