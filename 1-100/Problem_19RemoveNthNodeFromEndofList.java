
public class Problem_19RemoveNthNodeFromEndofList {
	
	/*public class ListNode {
		   
		int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}*/
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode start=new ListNode(0);
		ListNode slow=start,fast=start;
		start.next=head;
		
		for(int i=0;i<n;i++) {
			fast=fast.next;
		}
		
		while(fast.next!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		
		slow.next=slow.next.next;
		
		
		return start.next;
		
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
