package loop.fortest;

public class ForTest06 {

	public static void main(String[] args) {
		// if문을 사용하여 짝수를 출력하세요

		for (int i = 1; i < 10; i++) {
			// 홀수이면 다음진행해! --다음줄은 실행하지 않고 증감문으로 이동 
			if (i % 2 == 1) 
				continue;

			
			System.out.println(i);

		}

	}

}
