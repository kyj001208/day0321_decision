package loop.dowhiles;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTest04 {

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

	
		String msg=null;
		
		switch(i-num) {
		
		case -2: case 1:
			msg="이겼습니다";
			break;

		case -1:case 2:
			msg="졌습니다";
			break;
			
		case 0:
			msg="비겼습니다";
			break;
		}
		
		System.out.println(msg);

	}

}
