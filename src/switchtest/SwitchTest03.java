package switchtest;

import java.util.Scanner;

public class SwitchTest03 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("점수를 입력하세요");

		int score = in.nextInt();
		in.close();

		long start= System.nanoTime(); //돌아가는 시간 확인방법 (long 사용필요)

		switch (score/10) { //10나눠버리면 앞자리만 남게되며 이럴경우 범위를 쉽게 나타낼수 있음
		
		case 10:
		case 9: //90~99
			System.out.println("A");
			break;
		case 8://80~89
			System.out.println("B");
			break;
		case 7: //70~79
			System.out.println("C");
			break;
		case 6: //60~69
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;

		}
		long end= System.nanoTime();//돌아가는 시간 확인 방법
		System.out.println(end-start);
		
	}
}
