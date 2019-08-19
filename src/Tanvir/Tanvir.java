package Tanvir;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;



public class Tanvir {
	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println("stack capacity / size / element: "+s.capacity()+" / "+s.size()+" / "+s);
		s.add(1);s.add(10);s.add(3);s.add(4);
		System.out.println("stack capacity / size / element: "+s.capacity()+" / "+s.size()+" / "+s);
		boolean x = s.add(4);
		s.add(5);s.add(6);
		Integer push1 = (Integer) s.push(7);
		
		System.out.println("stack capacity / size / element: "+s.capacity()+" / "+s.size()+" / "+s);
		Integer y = (Integer) s.remove(0);
		Integer pop1 = (Integer) s.pop();
		Integer z = (Integer) s.peek();
		System.out.println("add / push / remove / pop / peek: "+ x +" / "+push1+" / "+y+" / "+pop1+" / "+z);
		System.out.println("stack capacity / size / element: "+s.capacity()+" / "+s.size()+" / "+s);

		System.out.println("s(1)"+s);
		ListIterator e = s.listIterator();
		while(e.hasNext()) {
			int x1 = (int) e.next();
			if(x1==3) {
				int z1 = e.previousIndex();
				System.out.println("index: "+z1);
			}
			System.out.println("s(interm): "+x1);
		}
		System.out.println("s(2)"+s);
		System.out.println(s);
		
		
	}
}
