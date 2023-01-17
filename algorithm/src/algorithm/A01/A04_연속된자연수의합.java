package algorithm.A01;

import java.util.Scanner;

public class A04_연속된자연수의합 {

	public static void main(String[] args) {

		// 스캐너로 값을 입력받기
		Scanner sc = new Scanner(System.in);
		
		// 변수 N에 자연수 입력받기
		int N = sc.nextInt();
		// 변수 선언 및 초기화
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		// 현재 연속 합이 N과 같은 경우
		// end_index가 N까지 가면 안됨
		while(end_index !=N) {
			if(sum == N) {	
				count++;	
				end_index++;	
				sum = sum + end_index;	// sum 값을 변경해줌
			} else if(sum > N) {	// 현재 연속 합이 N보다 더 큰 경우
					sum = sum - start_index;  // sum 값을 변경해줌
					// start_index를 먼저 빼준 뒤 start_index를 오른쪽으로 한칸 이동함.
					start_index++;
			} else {	// 현재 연속 합이 N보다 작은 경우
				end_index++;
				sum = sum + end_index;
			}
		}
		System.out.println(count);
	}

}
