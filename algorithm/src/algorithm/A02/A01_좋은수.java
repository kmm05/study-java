package algorithm.A02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A01_좋은수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 빠른 입출력을 위해 BufferedReader 사용
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());	// 데이터 개수 받기
		int Result = 0;	// 좋은 수 개수
		long A[] = new long[N];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {	// for문으로 데이터 저장
			A[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(A);	// 배열 정렬
		
		for(int k=0; k<N; k++) {	// k는 찾고자 하는 수
			long find = A[k];	// find가 좋은 수인지 아닌지 판별
			int i = 0;	// 시작 인덱스
			int j = N-1;	// 끝 인덱스
			
			// 투 포인터 알고리즘
			while(i<j) {
				if(A[i] + A[j] == find) {	// 왼쪽 값과 오른쪽 값이 좋은 수 인지 판별하는 식			
					// find는 서로 다른 두 수의 합이어야 됨
					if(i != k && j != k) { // 인덱스가 자기 자신이면 X, i랑 j가 둘다 k이면 안되므로 예외처리
						Result++;
						break;
				} else if(i==k) {	// 자기 자신이 포함되어 있을 경우 오른쪽으로 이동시킴
					i++;
				} else if(j==k) {	// 자기 자신이 포함되어 있을 경우 왼쪽으로 이동시킴
					j--;
				}
				} else if(A[i] + A[j] < find) {	// 두 수의 합이 find보다 작거나 크면 오른쪽, 왼쪽으로 이동시킴
					i++;
				} else {
					j--;
				}
			}
		}
		System.out.println(Result);
		bf.close();
	}

}
