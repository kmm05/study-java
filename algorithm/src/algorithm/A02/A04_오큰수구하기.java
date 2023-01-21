package algorithm.A02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class A04_오큰수구하기 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());	// 데이터 받기
		int[]A = new int[n];	// 수열 배열 생성
		int[]ans = new int[n];	// 정답 배열 생성
		String[] str = bf.readLine().split(" ");
		
		for(int i=0; i<n; i++) {	// 내 스택이 현재 비어있지 않고 현재 내 스택의 탑에 있는 값을 먼저 리턴해줌
			A[i] = Integer.parseInt(str[i]);
		}
		Stack<Integer> myStack = new Stack<>();
		myStack.push(0);	// 비어있는 스택의 최소 값을 push해 초기화
		for(int i=1; i<n; i++) {
			while(!myStack.isEmpty() && A[myStack.peek()] < A[i]) {	// 오큰수 조건
				ans[myStack.pop()] = A[i];	// 정답 배열에 오큰수를 저장
			}
			myStack.push(i);	// 현재 인덱스를 스택에 push
		}
		while(!myStack.empty()) {	// 스택이 없어질때까지 ans에 현재 스택에 있는 인덱스의 정답 리스트 자리에다 -1
			ans[myStack.pop()] = -1;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<n; i++) {
			bw.write(ans[i] + "");
			// ans의 데이터를 탐색하면서 데이터 저장 및 출력
		}
		bw.write("\n");
		bw.flush();
	}

}
