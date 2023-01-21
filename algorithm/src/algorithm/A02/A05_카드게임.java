package algorithm.A02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A05_카드게임 {

	public static void main(String[] args) {
		
		// 스캐너로 값을 입력받기
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<>();
		
		int N = sc.nextInt();	// 카드의 개수 N값 입력받기
		for(int i=1; i<=N; i++) {	// 카드가 1~N까지 있으므로 i=1, 카드를 큐에 저장
			myQueue.add(i);
		}
		while(myQueue.size() > 1) {	// 카드가 1장 남을 때까지 while문 반복
			myQueue.poll();			// poll연산을 통해 맨 위의 카드를 버림
			myQueue.add(myQueue.poll());	// 뽑은 카드를 맨 아래 카드 밑으로 이동
//			int temp = myQueue.poll();	// 뽑은 카드를 temp에 넣어줌
//			myQueue.add(temp);	// 뽑은 카드 데이터를 받아 myQueue에 넣어줌
		}
		System.out.println(myQueue.poll());	// 마지막으로 남은 카드 출력
	}

}
