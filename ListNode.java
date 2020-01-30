
public class ListNode {
	
	int val; 
	ListNode next; 
	
	public ListNode(int x) {
		val = x; 
	}
	
	public static void main (String[] args) {
		ListNode dope = new ListNode(4); 
		ListNode me = new ListNode(3); 
		dope.next = me; 
		
		System.out.printf("you wrote %d", dope.val);
		System.out.printf("\nnext node val %d", dope.next.val);
		
	}

}
