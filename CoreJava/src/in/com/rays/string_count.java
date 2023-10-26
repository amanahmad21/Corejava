package in.com.rays;

public class string_count {
public static void main(String[] args) {
	String names[]= {"aman","kaushal","abhiraj","aryan"};
	int count=0;
	for(char ch='a'; ch<='z';ch++) {
		for(int i=0; i<names[i].length(); i++) {
			for(int j=0; j<names[i].length();j++) {
				if(names[i].charAt(j)==ch){
				count++;	
				}
			}
		}
		if(count>0) {
			System.out.println(ch+" = "+count);
		}
	}
	
	
}
}








