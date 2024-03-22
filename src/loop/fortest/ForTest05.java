package loop.fortest;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력하세요.");

		int n = sc.nextInt();
		sc.close();

		for (int i = 0 ; i < n; i++) { //행개수

			for (int j = 0; j < n-i ; j++) { //열개수

				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
