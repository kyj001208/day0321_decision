package loop.fortest;

import java.util.Scanner;

public class ForTest04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력하세요.");

		int d = sc.nextInt();

		sc.close();

		for (int a = 0; a < d; a++) {// 행개수

			for (int b = 0; b < a; b++) {// 열개수

				System.out.print("* ");
			}

			System.out.println();

		}

	}

}
