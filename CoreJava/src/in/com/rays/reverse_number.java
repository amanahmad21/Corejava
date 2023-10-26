package in.com.rays;

public class reverse_number { 
	public static void main(String[] args) {
	int number=321,r=0,n=number,sum=0;
	while(n>0) {
		r=n%10;
	sum=(sum*10)+r;
			n=n/10;
	}
 

	System.out.println("the reverse of the given number is "+sum);

	}
}


