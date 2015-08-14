public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i < 21; i++) {
			System.out.println();
			if (i % 3 == 0) {
				System.out.println("fizz");
			}
			
			else if (i % 5 == 0) {
				System.out.println("buzz");
			}

			else if (i % i == 0) {
				System.out.println(i);
			}
			
		}
	}
}
