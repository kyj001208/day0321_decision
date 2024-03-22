package loop.dowhiles;

public class DoWhileTest03 {
	public static void main(String[] args) {

		int n = 1; // 1~9
		
		do {
			System.out.printf("%d * %d =%2d\n",2,n,2*n);
			n++;
		
		} while (n < 9);
	
	}

}
