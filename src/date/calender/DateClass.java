package date.calender;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat adf= new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat adff= new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(d.toString());
		System.out.println(adf.format(d));
		System.out.println(adff.format(d));

	}

}
