import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		// 일의자리
		int firstA = a % 10;
		int firstB = b % 10;

		// 십의 자리
		int secondA = a % 100 / 10;
		int secondB = b % 100 / 10;

		// 백의 자리
		int thirdA = a % 1000 / 100;
		int thirdB = b % 1000 / 100;

		int res1 = (firstA * firstB) + (secondA * firstB * 10) + (thirdA * firstB * 100);
		int res2 = (firstA * secondB) + (secondA * secondB * 10) + (thirdA * secondB * 100);
		int res3 = (firstA * thirdB) + (secondA * thirdB * 10) + (thirdA * thirdB * 100);
		int result = res1 + res2 * 10 + res3 * 100;
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(result);

	}

}
