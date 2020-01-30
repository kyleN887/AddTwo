
public class Solution {
	
	String person; 
	
	public Solution(String name) {
		person = name; 
		
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int arg3; 
		ListNode current, head, toDo; 
		boolean carryOver; 
		
		carryOver = false; 
		head = new ListNode(0); 
		current = head; 
		
		while (l1 != null || l2 != null) {
			
			arg3 = l1.val + l2.val;
			if (carryOver)
				arg3++; 
			if(arg3 > 9){
				carryOver = true; 
				arg3 -= 10; 
			}
			toDo = new ListNode(arg3); 
			current.next = toDo; 
			current = toDo; 
			l1 = l1.next; 
			l2 = l2.next; 
			
			
			
		}
		return head.next; 
	}
	

	
		
	
	
	public static void main (String[] args) {
		ListNode dope = new ListNode(2); 
		ListNode me = new ListNode(2); 
		ListNode dora = new ListNode(3); 
		
		ListNode kyle = new ListNode(3);
		ListNode jamal = new ListNode(0);
		ListNode kobe = new ListNode(5);

		
		dope.next = me; 
		me.next = dora; 
		
		kyle.next = jamal;
		jamal.next = kobe;
		
		Solution mine = new Solution("Kyle"); 
		ListNode answer = mine.addTwoNumbers(dope, kyle); 
				
		  while(answer != null) {
			System.out.println(answer.val); 
			answer = answer.next; 
		} 
		

	}

}
