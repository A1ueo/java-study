package homework;

public class Homework01 {

	public static void main(String[] args) {
		int[] arr = new int[] { 152, 180, 165, 158, 171 };

		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int idx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					idx = j;
				}
			}
			arr[idx] = arr[i];
			arr[i] = min;
		}

		for (int i : arr) {
			System.out.printf("%d, ", i);
		}
	}

}
