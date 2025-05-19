package homework;

import java.util.Arrays;

public class Homework07 {

	public static void main(String[] args) {
		String[] report = { "Introduction", "Research", "Conclusion" };
		String[] copy = Arrays.copyOf(report, report.length);
		copy[0] = "Team Feedback";

		System.out.print("원본 보고서: ");
		for (String str : report) {
			System.out.print(str + ", ");
		}

		System.out.print("\n복사된 보고서: ");
		for (String str : copy) {
			System.out.print(str + ", ");
		}

	}

}
