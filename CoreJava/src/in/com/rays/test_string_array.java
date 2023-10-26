package in.com.rays;

public class test_string_array {
	public static void main(String[] args) {
		String names[]= {"aman" ,"ahmad"};
		int count=0;
		for (char ch='a'; ch<=names.length;ch++) {
			for (int i = 0; i < names.length; i++) {
				for (int j = 0; j < names[i].length; j++) {
					
					if(names[i].charAt(j) == ch) {
						count++;
					}
				}
				
			}
			
		}
	}

}
