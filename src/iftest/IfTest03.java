package iftest;

import java.util.Scanner;

public class IfTest03 {
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("숫자만 입력하세요!");
		
		int num=in.nextInt();
		
		if(num%2==1) {
		//홀수 판별식 :(이름)%2==1 , 짝수 판별식:(이름)%2==0	
			System.out.println(num +":홀수");
		}
		
		else {
			System.out.println(num+ "짝수");
		}
		
		in.close();
		
		
	}

}
