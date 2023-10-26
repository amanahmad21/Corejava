package in.com.rays;

public class count_all_charcter {
	public static void main(String[] args) {
		String name="aman ahmad ";
		int count=0;
		for (char ch='a';ch<='z'; ch++) {
			for(int i=0;i<name.length();i++) {
				if(name.charAt(i)==ch) {
					count++;
				}
			}
			//if (count>0)
			//if(count==0) 
				{
			System.out.println(ch+"  count = "+count);
		}
		
		//count=0;
	}
	}
}
