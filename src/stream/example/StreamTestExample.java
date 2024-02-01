package stream.example;

import java.util.ArrayList;

import org.testng.annotations.Test;
//Find count of name start with A

public class StreamTestExample {
	@Test
	public void regular() {
	ArrayList<String> names= new ArrayList<String>();
	names.add("Abhijith");
	names.add("Don");
	names.add("Alekha");
	names.add("Adam");
	names.add("Ram");
	int count =0;
	for(int i=0; i<names.size(); i++) 
	    {
		String actual = names.get(i);
		if(actual.startsWith("A"))
		{
			count++;
		}		
	    }
	System.out.println(count);
	
	}

}
