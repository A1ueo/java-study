package homework;

import java.util.Arrays;

public class Homework04 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < 5;) {
			int tmp = (int) (Math.random() * 45) + 1;
			boolean isInArr = false;
			for (int num : arr) {
				if (tmp == num)
					isInArr = true;
			}
			if (isInArr)
				continue;
			arr[i++] = tmp;
		}
		Arrays.sort(arr);

		for (int i : arr)
			System.out.print(i + " ");
	}

}
