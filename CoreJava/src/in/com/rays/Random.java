package in.com.rays;

public class Random {

	public static void main(String[] args) {
		
		int max=1000;
		int min=1;
		int range=max-min;
		
		for (int i = 1; i <=8; i++) {
			int rd=(int)(Math.random()*range);
			
			System.out.println("random number ="+rd);
			
			
			
		}
		
		
		
	}
	
}
