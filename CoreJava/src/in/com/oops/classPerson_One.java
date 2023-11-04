package in.com.oops;

import java.util.Date;

public class classPerson_One {
	private int id;
	private String name;
	private Date dob;
	public static final int AVG_AGE = 18;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
