package algorithm.A01;

import java.util.Scanner;

public class A02_평균1 {

	public static void main(String[] args) {

		// 스캐너로 값을 입력받음
		Scanner sc = new Scanner(System.in);
		
		// 변수 N에 과목 수 입력받기
		int N = sc.nextInt();
		
		// 총점
		long sum = 0;
		// 최댓값
		long max = 0;
		for(int i=0; i<N; i++) {
			// 점수 데이터 입력받기
			int temp = sc.nextInt();
			// 최대 점수 찾기 
			if(temp>max) {
				// 최댓값 가져옴
				max = temp;			
				// 값이 들어올 떄마다 데이터를 sum에 더해줌.
				sum = sum + temp;
			}
			}	
			// 평균값 출력
			System.out.println(sum * 100.0 / max / N);
	}

}
