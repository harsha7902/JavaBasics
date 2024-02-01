package coreJava.part2;

public class Constructor {
	int  value1;
    int  value2;
    public void Demo(int a){
        value1 = a;
        System.out.println("Inside 2nd Constructor");
      }
    public void Demo(int a,int b){
      value1 = a;
      value2 = b;
      System.out.println("Inside 3rd Constructor");
     }
     public void display(){
        System.out.println("Value1 === "+value1);
        System.out.println("Value2 === "+value2);
    }

	public static void main(String[] args) {
		Constructor d1 = new Constructor();
//		Constructor d2 = new Constructor(30);
//		Constructor d3 = new Constructor(30,40);
	    d1.display();
//	    d2.display();
//	    d3.display();

	}

}
