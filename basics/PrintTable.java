package basics;

public class PrintTable {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = 2; j <= 10; j++) {
				System.out.print("\t"+ i * j);
			}
			System.out.println();

		}

	}

}