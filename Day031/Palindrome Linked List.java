class Solution {
    public boolean isPalindrome(ListNode head) {
       ListNode fast=head;
        ListNode slow=head;
        if(head==null || head.next==null)
        
        return true;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode temp1=reverse(slow);
        ListNode start=head;
        while(start!=slow)
        {
            if(start.val==temp1.val)
            {
                start=start.next;
                temp1=temp1.next;
            }
            else
                return false;
        }
        return  true;
    }
    
   static  ListNode reverse(ListNode temp)
    {
        ListNode curr=temp;
        ListNode prev=null;
        ListNode next=curr.next;
        while(curr!=null)
        {
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null)
            {
                next=next.next;
            }
        }
        return prev;
    }
}
