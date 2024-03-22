package loop.whiles;

public class WhileTest03 {

	public static void main(String[] args) {

		//중첩 반복문 가능
	
		
		int out=0;
		while(out<3) {
		
			
			int i=0;
			while (i < 3) {
			System.out.print("* ");
			++i;

		}

		System.out.println(); 
		
		out++;
		} // 3행 3열로 출력됌

	}

}
