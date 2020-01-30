
public class Solution {
	
	String person; 
	
	public Solution(String name) {
		person = name; 
		
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int arg3; 
		ListNode current, head, toDO; 
		
		arg3 = adder(l1) + adder(l2); 
		head = new ListNode(arg3 % 10); 
		current = head; 
		arg3 = arg3/10; 
		
		while(arg3 > 0) {
			toDO = new ListNode(arg3 % 10); 
			current.next = toDO; 
			current = toDO; 
			arg3 = arg3/10; 
			
		}
		
		return head; 
	}
	public static int adder(ListNode node) {
		int num, factor;
		
		for(factor = 1, num = 0; node != null; node = node.next, factor = factor*10) {
			num = num + (node.val*factor); 
			
		}

		
		
		
		
		return num; 
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
		System.out.println("damn hit change");
				
		  while(answer != null) {
			System.out.println(answer.val); 
			answer = answer.next; 
		} 
		

	}

}
