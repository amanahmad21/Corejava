package in.com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test_string_date {
	public static void main(String[] args) throws ParseException {
		String s="28/09/2004";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Date d = sdf.parse(s);
		System.out.println(d);
		}

}
