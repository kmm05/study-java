package algorithm.A01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A05_주몽 {

	public static void main(String[] args) throws IOException {

		// BufferedReader 쓰는 이유 : 빠른 입출력을 위해서 씀. Buffered가 Scanner보다 더 빠름.
		
		// BufferedReader로 데이터 받기
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// 재료의 개수
		int N = Integer.parseInt(bf.readLine());
		// 갑옷이 되는 번호
		int M = Integer.parseInt(bf.readLine());
		
		// 배열 생성
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		// A 배열을 오름차순으로 정렬 
		Arrays.sort(A);
		// 정답 변수 초기화
		int count = 0;
		// A[0]에서 시작 -> 최솟값
		int i = 0;
		// A[N-1]에서 시작 -> 최댓값
		int j = N-1;
		
		while (i<j) {
			if(A[i]+A[j]<M) {
				i++;
			} else if (A[i]+A[j]>M) {
				j--;
			} else {
				count++;
				i++;
				j--;
			}
		}
		System.out.println(count);
		bf.close();
	}

}
