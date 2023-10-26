package in.com.rays;

public class string_alphabet_java {
public static void main(String[] args) {
	String names="aman ahmad";
	for (char ch='a'; ch<'z'; ch++) {
		int count=0;
		for (int i = 0; i < names.length(); i++) {
			if(names.charAt(i) == ch) {
				count++;
			}
			
		
		//if(count>0)
		
			System.out.println(ch+" = "+count);
		}
	}
	
}

}
