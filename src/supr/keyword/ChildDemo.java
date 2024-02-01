package supr.keyword;

public class ChildDemo extends ParentDemo{
	String name="rajan";
	public ChildDemo() {
		super();    //this should be first line
		System.out.println("child class constructor");
	}
	
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);//it called from parent class
	}

	public static void main(String[] args) {
		ChildDemo dd =new ChildDemo();
		dd.getStringData();

	}

}
