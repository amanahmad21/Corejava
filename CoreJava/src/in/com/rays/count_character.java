package in.com.rays;

public class count_character {
	public static void main(String[] args) {
		String name="aman ahmad ansari";
		int count=0;
		for(int i=0; i<name.length();i++) {
			if(name.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println("count = "+count);
	}

}
