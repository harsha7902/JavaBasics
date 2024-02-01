package coreJava.part2;

import java.util.Scanner;

public class NumPyramid2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Loop to iterate through rows
        for (int i = 1; i <= numRows; i++) {
            // Loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner to prevent resource leak
        scanner.close();

	}

}
