package loop.fortest;

public class ForTest01 {

	public static void main(String[] args) {
		// 
		
		//for(1.초기값;2.조건문;3.증감문) {4.실행문장(반복구간)} 5.탈출
		//1번 영역은 제일 먼저 실행 되고 최초 1번만 실행
		//2번 true이면 4번 실행문으로 이동 
		//4번 실행문이 도달하면 3번 증감문 실행 → 증감문 실행 후 조건문으로 이동
		//2번 false이면 5번으로 이동{반복문 탈출}
		
		System.out.println("for문 시작");
		
		for(
				int i=0;
				i<3; 
				i++) 
		{
			System.out.println("실행문");
		}
	
		System.out.println("for문 종료");
	}

}
