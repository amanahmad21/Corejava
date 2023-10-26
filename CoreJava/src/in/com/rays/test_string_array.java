package in.com.rays;

public class test_string_array {
	public static void main(String[] args) {
		String names[]= {"aman" ,"ahmad"};
		
			for (int i = 0; i < names.length; i++) {
				for (int j =  names[i].length()-1; j >= 0; j--) {
					
					System.out.print(names[i].charAt(j));
					}
				System.out.println(" ");
				}
				
			}
			
		
	}


