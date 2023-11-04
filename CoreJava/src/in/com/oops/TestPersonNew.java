package in.com.oops;

public class TestPersonNew {
	public static void main(String[] args) {

		PersonNew p = new PersonNew();

		p.setId(10);
		p.setFirstName("AMAN");
		p.setLastName("AHMAD");

		System.out.println(p.getId());
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(PersonNew.AVG_AGE);
	}

}
