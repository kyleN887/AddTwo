
public class Solution {
	
	String person; 
	
	public Solution(String name) {
		person = name; 
		
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int arg3; 
		ListNode current, head, toDo; 
		
		head = new ListNode(0); 
		current = head; 
		
		while (l1 != null || l2 != null) {
			
			if(l1 == null) {
				copyMachine(l2, current); 
				break; 
			}
			
			if(l2 == null) {
				copyMachine(l1, current); 
				break; 
			}
			
			arg3 = l1.val + l2.val; 
			
			toDo = new ListNode(arg3 % 10); 
			current.next = toDo; 
			current = toDo; 
			
			if (arg3 > 9) {
				if (l1.next != null) {
					l1.next.val++; 
				}else if(l2.next != null) {
					l2.next.val++; 
				}else {
					toDo = new ListNode(1);
					current.next = toDo; 
				}
			}
			l1 = l1.next; 
			l2 = l2.next; 
			
			
			
		}
		return head.next; 
	}
	public void copyMachine(ListNode node, ListNode current) {
		ListNode toDo; 
		
		while (node != null) {
			toDo = new ListNode(node.val %10 ); 
			current.next = toDo; 
			current = toDo; 
			if(node.val > 9) {
				if(node.next != null)
					node.next.val ++; 
				else {
					toDo = new ListNode(1);
					current.next = toDo; 
				}
			}
			node = node.next; 
		}
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
