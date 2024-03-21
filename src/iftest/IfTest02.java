package iftest;

import java.util.Scanner;

public class IfTest02 {
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("숫자만 입력하세요!");
		
		int num=in.nextInt();
		
		if(num%2==1) {
		//홀수 판별식 :(이름)%2==1 , 짝수 판별식: (이름)%2==0	
			System.out.println(num +":홀수");
		}
		
		if (num%2==0) {
			System.out.println(num+":짝수");
			//해당 코드를 else로 변경하여 사용 가능
			
		}
		
		in.close();
		
		
	}

}
