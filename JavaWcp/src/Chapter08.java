
public class Chapter08 {

	public static void main(String[] args) {
		int count = 1;
		while (count < 5) {
			System.out.println(count * count);
			count++;
		}

		int[] array = { 5, 10, 15, 20 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		for (int number : array) {
			if (number % 2 == 0) {
				continue;
			}
			System.out.println(number);
		}
	}

}
