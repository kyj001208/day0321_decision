package loop.dowhiles;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTest05 {

	public static void main(String[] args) {

		// 간단한 게임 (가위 바위 보)
		// 컴퓨터 vs 나
		// 사용자는 1가위2바위3보 선택
		// 컴퓨터는 랜덤 Random(클래스이름)

		Scanner sc = new Scanner(System.in);
		System.out.println("Game start");
		System.out.println("선택: 1 가위, 2 바위, 보3 ");
		int i = sc.nextInt();
		sc.close();

		Random ran = new Random();
		int num = ran.nextInt(3) + 1; // 0~2지만 1을 +하면 1~3까지 나옴

		System.out.println("com:" + num);
		System.out.println("user:" + i);

		// 이긴경우/ 진 경우, 비긴경우

		int result = i - num;
		if (result == 0) {
			System.out.println("비김");

		} else if (result == -2 || result == 1) {
			System.out.println("이김");

		} else if (result == -1 || result == 2) {
			System.out.println("짐");

		}

	}

}
