package iftest;

public class IfTest04 {

	public static void main(String[] args) {
		// 중첩 if문

		int num = 0;

		if (num == 0) {
			System.out.println("0입니다");

		} else { // num이 0이 아니면 큰지 작지 구분하기 위해 else 안에 if문 및 else문을 쓸수 있음

			if (num > 0)
				System.out.println("0보다 크다");
		else 
				System.out.println("0보다 작다");

		
			// 한줄일 경우 {} 생략 가능
				
		

		}

}

}
