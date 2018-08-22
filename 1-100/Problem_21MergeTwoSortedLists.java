
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Problem_21MergeTwoSortedLists {

public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
	
	ListNode result=new ListNode(0);   
        ListNode start=result;  
        ListNode h1=l1,h2=l2;  
        while(h1!=null||h2!=null) {
        	
        	if(h1!=null&&h2!=null) {	
        		double t1=0,t2=0;
        		t1=h1.val;	
        		t2=h2.val;
        	
        	if(t1<=t2) {
        		result.next=h1;
        		result=result.next;      	
        		h1=h1.next;
        	       }
        
        	if(t1>=t2) {
        		result.next=h2;
        		result=result.next;
        		h2=h2.next;
        	}
        }else if (h1!=null) {
        	result.next=h1;
        	result=result.next;
        	h1=h1.next;
        }else if(h2!=null) {
        	result.next=h2;
        	result=result.next;
        	h2=h2.next;
        }
        	
        	
        	}
        	
       
        
        return start.next;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
