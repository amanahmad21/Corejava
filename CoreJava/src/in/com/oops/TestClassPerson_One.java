package in.com.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestClassPerson_One {
	public static void main(String[] args) throws ParseException {
		classPerson_One p = new classPerson_One();

		p.setId(10);
		p.setName("abc xyz");
		p.setDob(new SimpleDateFormat("dd/MM/yyyy").parse("04/11/2023"));

		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(p.getDob()));
		System.out.println(classPerson_One.AVG_AGE);
	}

}


