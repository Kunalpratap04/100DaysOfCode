class Solution {
    public ListNode deleteMiddle(ListNode head) {
         ListNode temp = head,fast=head;
        if(head==null||head.next==null)
            return null;
        while(fast.next!=null&& fast.next.next!=null)
        {
            fast=fast.next.next;
            if(fast.next!=null)
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
