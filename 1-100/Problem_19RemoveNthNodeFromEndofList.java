
public class Problem_19RemoveNthNodeFromEndofList {
	
	public class ListNode {
		   
		int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 
		 ListNode temp=new ListNode(0);
		 temp=head;
		 for(int i=0;i<n;i++) {
			 temp=temp.next;
			 
		 }
		 
		if(temp.next!=null)temp.next=temp.next.next;
		
		 
	        return head;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
