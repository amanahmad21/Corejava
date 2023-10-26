package in.com.rays;

public class palindrome {
	public static void main(String[] args) {
	int number=151,r=0,n=number,sum=0;
	while(n>0) {
		r=n%10;
	sum=(sum*10)+r;
			n=n/10;
	}
 
if(number==sum)
{
	System.out.println(sum+" is a palindrome number");
}else
	System.out.println(sum+" is not a palindrome number");	
}
}