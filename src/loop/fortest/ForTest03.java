package loop.fortest;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력하세요.");

		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
