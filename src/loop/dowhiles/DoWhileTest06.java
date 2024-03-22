package loop.dowhiles;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTest06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 시작하는 영역

		while (true) {
			System.out.println("Game start");
			System.out.println("선택: 1 가위, 2 바위, 보3 ");
			int i = sc.nextInt();

			Random ran = new Random();
			int num = ran.nextInt(3) + 1;
			System.out.println("com:" + num);
			System.out.println("user:" + i);

			String msg = null;

			switch (i - num) {

			case -2:
			case 1:
				msg = "이겼습니다";
				break;

			case -1:
			case 2:
				msg = "졌습니다";
				break;

			case 0:
				msg = "비겼습니다";
				break;
			}

			System.out.println(msg);

			System.out.println("1. one more 2. exit"); // 끝
			System.out.println("선택 >");

			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("다음게임을 실행합니다");
				continue;//다음 실행문

			}else {
				System.out.println("게임을 종료합니다");
				break;


			}

		}
	}
}
