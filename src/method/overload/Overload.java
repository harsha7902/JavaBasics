package method.overload;

public class Overload {
	public void getData(int i) {
		
	}
	public static int getData(int j,int n) {
		 return j+n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Overload.getData(11,12));

	}

}
