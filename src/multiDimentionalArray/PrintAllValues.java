package multiDimentionalArray;

public class PrintAllValues {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		a[0][0]=1;
		a[0][1]=5;
		a[1][0]=3;
		a[1][1]=4;
//		System.out.println(a[1][0]);
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
				

	}

}
