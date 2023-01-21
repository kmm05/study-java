package algorithm.A02;

import java.util.List;

public class A02_ex1 {

	public ListNode oddEvenList(ListNode head) {
		if(head == null) {
			return head;
		}
		
		ListNode odd = head, even = head.next, evenHead = even;
		
		while(odd.next != null && even.next != null) {
			odd.next = odd.next.next;
			even.next = even.next.next;
			odd = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
		
		
		
	}

}
