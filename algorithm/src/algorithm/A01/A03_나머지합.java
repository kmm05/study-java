package algorithm.A01;

import java.util.Scanner;

public class A03_나머지합 {

	public static void main(String[] args) {

		// 스캐너로 값을 입력받기
		Scanner sc = new Scanner(System.in);
		
		// 변수 N에 수열의 개수 입력받기
		int N = sc.nextInt();
		
		// 변수 M에 나누어떨어져야 하는 수 입력받기
		int M = sc.nextInt();
		
		// 합 배열 선언하기
		long[] S = new long[N];
		
		// 같은 나머지의 인덱스를 카운트하는 배열 선언하기
		long[] C = new long[M];
		
		// 정답 변수 선언하기
		long answer = 0;
		S[0] = sc.nextInt();
		
		for(int i=1; i<N; i++) {	
			// 수열 합 배열 저장하기
			S[i] = S[i-1] + sc.nextInt();
		}
		for(int i=0; i<N; i++) {	
			// 합 배열을 M으로 나눈 나머지 값
			int remainder = (int) (S[i] % M);
			// 0~i까지의 구간 합 자체가 0일 떄 정답에 1 증가시킴
			if(remainder == 0) answer++;
			// 나머지가 같은 인덱스의 개수 카운팅하기
			C[remainder]++;
			}
		for(int i=0; i<M; i++) {
			if(C[i]>1) {	
				// 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 정답에 더하기
				// 조합 구하는 공식
				answer = answer + (C[i]*(C[i]-1)/2);
			}
		}
		System.out.println(answer);
	}

}
