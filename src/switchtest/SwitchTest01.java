package switchtest;

public class SwitchTest01 {

	public static void main(String[] args) {
		/*
		switch(변수 값) {
		case 값1: 변수가 값 1일때 실행하는 코드
		case 값2: 변수가 값 2일때 실행하느 코드
		case 값3: 변수가 값 3일때 실행하느 코드
		default:  값이 없는 실행하는 코드
		}
		//*/
		
		int num=2;
		
		switch(num) { //정수형, 문자형(Char), 문자열까지 혀용, 실수형은 불가능
		case 1: //위치지시자
			System.out.println("Vip 등급 입니다. 포인트 100,000");
		case 2:
			System.out.println("골드 등급입니다. 포인트 10,000");
		case 3:
			System.out.println("실버 등급입니다. 포인트 1000");
		default:
			System.out.println("게스트 유저 사용가능합니다");
			
		}
	}
}
