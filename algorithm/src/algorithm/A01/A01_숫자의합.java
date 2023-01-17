package algorithm.A01;

import java.util.Scanner;

public class A01_숫자의합 {

	public static void main(String[] args) {
		
		// 스캐너로 값을 입력받기
		Scanner sc = new Scanner(System.in);
		
		// 숫자를 입력받기
		int N = sc.nextInt();	
		
		// 입렵값을 String형으로 받음
		String sNum = sc.next();
		// 변수 sNum에 저장한 후 char[]형 변수로 변환하기
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		
		// cNum에 길이까지 가면서 각 자리에 있는 숫자를 sum에 더해 누적함
		for(int i=0; i<cNum.length; i++) {
		
		/* 아스키 코드를 이용해 cNum에 있는 문자형의 값을 int형으로 바꿔줄 때는 
		 * 문자 0을 빼주거나 48을 빼줌 */
		sum += cNum[i] - '0';	
		}
		
		// sum 값 출력
		System.out.println(sum);
		}
	}