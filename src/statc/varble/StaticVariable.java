package statc.varble;

public class StaticVariable {
	String name;
	String adress;
	static String city="pkd";
	static int i=0;
	StaticVariable(String name, String adress){
		this.name=name;
		this.adress=adress;
//		this.city=city;
		i++;
		System.out.println(i);
	}
	
//	public void getAddress() {
//		System.out.println(name+" "+adress+" "+city);
//	}
//	static method example-calling static method using classname not object 
	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		StaticVariable obj = new StaticVariable("harsha","rajeevam");
		StaticVariable obj1 = new StaticVariable("anu","akar");
//		obj.getAddress();
//		obj1.getAddress();
		StaticVariable.getCity();
		
		
		

	}

}
