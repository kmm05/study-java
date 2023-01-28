package algorithm.A03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class A01_절대값힙 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// 비교할 객체 선언 및 정렬의 기준 세우기
		// 리턴값이 음수인지 양수인지로 o1, o2의 비교정렬의 기준을 세움.
		PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1, o2) -> {
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			// 절대값이 같을 경우
			// 절대값이 같은 경우 음수 우선 정렬
			if(first_abs == second_abs) {
				// 첫번째 데이터가 두번째 데이터보다 더 크면 양수(1)리턴 아니면 음수(-1) 리턴
				return o1 > o2 ? 1 : -1;
			} else {
				// 절대값이 다를 경우
				// 절대값이 작은 데이터 우선
				return first_abs - second_abs;
			}
		});
		
		for(int i=0; i<N; i++) { 
			int request = Integer.parseInt(br.readLine());
			if(request == 0) {
				// MyQueue가 비어있으면 0출력
				if(MyQueue.isEmpty()) {
					System.out.println("0");
			} else { // 안비어있을 경우 MyQueue에서 정렬되어 있는 데이터 뽑음
				System.out.println(MyQueue.poll());
			}
		} else { // request가 1일 경우
			MyQueue.add(request);
		}
		}
	}

}
