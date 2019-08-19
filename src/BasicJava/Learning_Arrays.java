package BasicJava;

import java.util.Arrays;

public class Learning_Arrays {

	public static void main(String[] args) {
		
		int [] number=new int[5];//1.we can write this way.If we want to print full arrays then use iterator
									//or for loop.
		number[0]=12;
		number[1]=8;
		number[2]=6;
		number[3]=4;
		number[4]=10;
		System.out.println(number[4]);
		Arrays.sort(number);
		for (int i:number) {
			System.out.println(i);
		}
		
		int[] num=new int[]{1,3,5,7,9};//2. also we can write this way
		Arrays.sort(num);
		for (int i:num) {
			System.out.println(i);	
		}
		
	}

}
