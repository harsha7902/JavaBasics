package coreJava.part2;

public class NumPyramidUpward {

	public static void main(String[] args) {
		int k=1;
		for(int i=1; i<5; i++) {
			
//			System.out.println(i);
			for(int j=1; j<=i; j++) {
				System.out.print(k + "\t");
				k++;
			}
			System.out.println("");
		}

	}

}
