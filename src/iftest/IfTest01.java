package iftest;

public class IfTest01 {

	public static void main(String[] args) {
		
		//if(조건식 ) {조건식이 true일때 실행하는 블록}
		
		int num=11;
		
		System.out.println("if문 이전!");
		
		if(num%2==0) {//짝수 (10을 2로 나누었을때 0으로 되니? OutPut :if문 이전! 10은 짝수
			
		//num%2==0에서 2를 홀수로 변경하면 Output: if문 이전?만 출력	
			
			System.out.println(num+"은 짝수"); //"10 은 짝수"
			
			
		}
		
		if(1==num%2) //{}를 생략가능하지만 생략하지 말고 쓰기
			
		System.out.println("홀수");
		
		System.out.println("if문 이후!");
	}
}
