package loop;

public class WhileTest04 {

	public static void main(String[] args) {

		int dan = 2; //초기값
		while (dan <=9) //조건문
		
		{
			int i;

			i = 1;
			while (i <= 9) {
				System.out.printf("%d * %d = %2d\n", dan, i, dan * i);
				i++;//증가문

			}//i가 돌아가는 구간

			System.out.println();
			dan++;//증가문

		} //dan이 돌아가는 구간

		
	}

}
