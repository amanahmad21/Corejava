package in.com.rays;


public class arm_strong {
     public static void main(String[] args) {
		int number=153,r=0,n=number,sum=0;
		while(n>0) {
			r=n%10;
		sum=sum+(r*r*r);
				n=n/10;
		}
     
	if(number==sum)
	{
		System.out.println(number+" is a armstrong number");
	}else
		System.out.println(number+" is not a armstrong number");	
}
}