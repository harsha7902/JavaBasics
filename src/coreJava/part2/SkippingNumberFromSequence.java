package coreJava.part2;

public class SkippingNumberFromSequence {

	public static void main(String[] args) {

//		for (int i = 1; i <= 20; i++) {
//			if (i >= 15 & i <= 18) {
//				continue;
//			}
//			System.out.println(i);
//		}
		int a=14;
		int b=12;
		System.out.println("a is "+ a + " and b is"+b);
		a=b;
		int temp=a;
		b=temp;
		System.out.println("After swaping:a is: "+a + " b is:" +b);
		
	}
}
