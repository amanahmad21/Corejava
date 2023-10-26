package in.com.rays;

public class testsecondlargest {public static void main(String[] args) {

	int[] arr = { 1200, 700, 800, 100, 1000, 5, 15, 25, 50, 45, 1100 };

	int min = 0;
	int max = 0;

	for (int i = 0; i < arr.length; i++) {

		if (arr[i] > max) {
			min = max;
			max = arr[i];
		}

		if (min < arr[i] && max > arr[i]) {
			min = arr[i];
		}

	}

	System.out.println("Second Largest = " + min);
}

}


