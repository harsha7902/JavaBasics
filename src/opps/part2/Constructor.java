package opps.part2;

public class Constructor {
	public Constructor() {
		System.out.println("inside constructor");
	}
	public Constructor(int a,int b) {
		System.out.println("inside parameterized constructor");
		int c=a+b;
		System.out.println(c);
	}
	public Constructor(String str) {
		System.out.println(str);
	}
	
	public void getdata() {
		System.out.println("inside method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor cd=new Constructor("hello");
//		cd.getdata();
		Constructor cdsd=new Constructor(158,5);
		

	}

}
