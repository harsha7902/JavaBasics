package multiDimentionalArray;

import java.util.Arrays;

public class PrintMinimumNumber {

	public static void main(String[] args) {
		/*
		 2 4 6
		 8 9 0
		 1 5 3
		 * */
		
		int abc[][]= {{2,4,6},{8,9,3},{1,5,3}};
		int min=abc[0][0];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(abc[i][j]<min) {
					min=abc[i][j];
				}
			}
		}
		System.out.println(min);
		}
		
	

}
