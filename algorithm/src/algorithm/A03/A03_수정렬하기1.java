package algorithm.A03;

import java.util.Scanner;

public class A03_수정렬하기1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		// N의 크기만큼 정렬할 배열 선언
		int[] A = new int[N];
		
		for(int i=0; i<N; i++) {
			// 반복문을 통해 A 배열의 데이터를 받음. 정렬되지 않은 데이터가 들어옴
			A[i] = sc.nextInt();
		} 
		// 버블 정렬을 구현함
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<N-1-i; j++) {
				if(A[j] > A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		// A 배열 출력
		for(int i=0; i<N; i++) {
			System.out.println(A[i]);
		}
	}

}
