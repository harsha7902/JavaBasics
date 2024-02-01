package oops.part3;

public class ExceptionHandling {
	int a=1;
	

	public static void main(String[] args) 
	{
		
		try 
		{
			int b=2;
			int c=0;
			int k=b/c;
			
				System.out.println(k);
		}
		catch(Exception e)
		{
			System.out.println("catched the error");
		}
		

	}

}
