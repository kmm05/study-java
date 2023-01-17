package algorithm.A01;

import java.util.Scanner;

public class A01_평균 {

	public static void main(String[] args) {

		// 스캐너로 값을 입력받음
		Scanner sc = new Scanner(System.in);
		
		// 변수 N에 과목 수 입력받기
		int N = sc.nextInt();
		
		// 점수들을 저장하는 A배열 생성
		int A[] = new int[N];
		
		// A배열에 점수 데이터 저장
		for(int i=0; i<N; i++) {
			// A의 i번째에다 점수 데이터 받아 저장
			A[i] = sc.nextInt();
		}
		// 총점
		long sum = 0;
		// 최댓값
		long max = 0;
		for(int i=0; i<N; i++) {
			// 최대 점수 찾기 
			if(A[i]>max) {
				// A배열의 최댓값 가져옴
				max = A[i];			
				// 값이 들어올 떄마다 데이터를 sum에 더해줌.
				sum = sum + A[i];
			}
			}	
			// 평균값 출력
			System.out.println(sum * 100.0 / max / N);
	}

}
