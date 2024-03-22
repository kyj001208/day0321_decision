package loop.fortest;

public class ForTest02 {

	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단");

			for (int n = 1; n <= 9; n++) {
				System.out.printf("%d * %d =%2d\n", dan, n, dan * n);

			}
			System.out.println();
		}

	}

}
