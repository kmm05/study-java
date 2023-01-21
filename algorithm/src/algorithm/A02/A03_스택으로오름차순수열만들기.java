package algorithm.A02;

import java.util.Scanner;
import java.util.Stack;

public class A03_스택으로오름차순수열만들기 {

	public static void main(String[] args) {
		
		// 스캐너로 값을 입력받기
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 수열의 개수 받기
		int[] A = new int[N];	// 개수만큼 A배열 만들기
		
		for(int i=0; i<N; i++) {	// 데이터 받기
			A[i] = sc.nextInt();
		}
		Stack<Integer> stack = new Stack<>();	// 스택 자료구조 사용
		StringBuffer bf = new StringBuffer();
		
		int num = 1;	// 오름차순 수
		boolean result = true;
		
		for(int i=0; i<A.length; i++) {	// 수열 탐색
			int su = A[i];	// 수열의 수
			if(su>=num) {
				while(su>=num) {	// 수열 값 >= 오름차순 자연수인 경우 push()로 값이 같아질 때까지 실행	
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			}
			else {	// 현재 수열 값 < 오른차순 자연수인 경우 pop()을 실행해 데이터 뺌
				int n = stack.pop();
				// 스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 X
				if(n>su) {
					System.out.println("NO");
					result = false;
					break;
				}
				else {
					bf.append("-\n");
				}
			}
		}
		if(result) {
			System.out.println(bf.toString());
		}
	}

}
