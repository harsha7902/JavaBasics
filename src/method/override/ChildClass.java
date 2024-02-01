package method.override;

public class ChildClass extends ParentClass{
	public void color() {
		System.out.println("child color");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass parentclass =new ParentClass();
		ChildClass childclass1 =new ChildClass();
		ParentClass childclass2 =new ChildClass();
		parentclass.color();
		childclass1.color();
		childclass2.color();

	}

}
