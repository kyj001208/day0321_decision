package switchtest;

public class SwitchTest02 {

	public static void main(String[] args) {
		/*
		switch(변수 값) {
		case 값1: 변수가 값 1일때 실행하는 코드
		break;
		case 값2: 변수가 값 2일때 실행하느 코드
		break;
		case 값3: 변수가 값 3일때 실행하느 코드
		break;
		default:
		}
		//*/
		
		int num=2;
		
		switch(num) { //정수형, 문자형(Char), 문자열까지 혀용, 실수형은 불가능
		case 1: //위치지시자
			System.out.println("Vip 등급 입니다. 포인트 100,000");
			break;//{블럭}빠져나간다. 
			// break 사용전에는 case1번을 사용시 아래 모두 사용가능하지만 
			// break 사용시에는 해당 케이스(구간)만 사용 가능 
		case 2:
			System.out.println("골드 등급입니다. 포인트 10,000");
			break;
		case 3:
			System.out.println("실버 등급입니다. 포인트 1000");
			break;
		default:
			System.out.println("게스트 유저 사용가능합니다");
			
		}
	}
}
