package basics;

public class Array {
	
	public static void main(String[] args) {
	
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		for (int i = 0; i <numbers.length; i++) { 
			for(int j=2;j<=10;j++) {
				System.out.print("\t"+ j*numbers[i]);
			}
	
		
			System.out.println();

		}
	}

}
