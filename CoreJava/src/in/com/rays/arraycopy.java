package in.com.rays;

public class arraycopy {
	public static void main(String[] args) {
		char copyfrom[]= {'a','s','d','f','g','h','j','d','k'};
		char copyTo[]=new char[8];
		System.arraycopy(copyfrom,0,copyTo,2,8);
		System.out.println(new String(copyTo));
		
	}

}
