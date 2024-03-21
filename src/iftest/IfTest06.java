package iftest;

import java.util.Scanner;

public class IfTest06 {

	public static void main(String[] args) {
		// 점수에 따라 학점을 표현
		// 90점 이상 A
		// 80점 이상 B
		// 70점 이상 C
		// 60점 이상 D
		// 60점 미만 F

		Scanner in = new Scanner(System.in);
		System.out.println("점수를 입력하세요");

		int score = in.nextInt();
		in.close();
		
		//System.currentTimeMillis(); //돌아가는 시간 확인방법 (long 사용필요)
		long start= System.nanoTime();//돌아가는 시간 확인방법 (long 사용필요)

		if (score >= 90) {
			System.out.println("A등급");
		}else if (score >= 80) {
			System.out.println("B등급");
		}else if (score >= 70) {
			System.out.println("C등급");
		}else if (score >= 60) {
			System.out.println("D등급");

		}else { // 나머지는 F이므로 물어볼 필요 없음
			System.out.println("F등급");
		}
		long end= System.nanoTime();
		System.out.println(end-start);//돌아가는 시간 확인방법
		
	}

}
