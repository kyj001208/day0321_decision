package loop.dowhiles;

public class DoWhileTest02 {

	public static void main(String[] args) {

		// 직역변수 : 스택(stack) 메모리를 사용해서 할당됨
		// 스택 메모리는 초기화가 되지 않기에 초기화 시켜줘야함

		int i = 1;
		int sum = 0;

		do {
			System.out.println(i);//1~10
			//sum = sum+i;

			sum += i;

		} while (++i <= 10);

		System.out.println("1~10까지의 합은?" + sum);

	}
}
