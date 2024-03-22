package iftest;

public class OperatorTest01 {

	public static void main(String[] args) {

		// 삼항연산자
		// (조건)? 으로 사용시 참 거짓으로 구분

		int num = 3;

		String name = num == 1 ? "가위" : num==2?"바위": "보";

		System.out.println(name);
		
		//if-else문을 위와 같은 삼항연산자로 쓸수 있다

		if (num == 1) {
			name = "가위";

		} else if (num == 2) {
			name = "바위";

		} else {
			name = "보";
		}

		System.out.println(name);
	}

}
