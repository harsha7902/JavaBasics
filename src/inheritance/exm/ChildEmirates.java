package inheritance.exm;

public class ChildEmirates extends ParentAirCraft{
	public static void main(String[] args) {
		ChildEmirates childemirates=new ChildEmirates();
		childemirates.engin();
		childemirates.saftyGuilines();
		childemirates.bodyColor();

		
			
		}
	@Override
	public void bodyColor() {
		System.out.println("red color");
		
	}
	

}
