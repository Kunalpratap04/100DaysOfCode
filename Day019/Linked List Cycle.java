public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head,slow=head;
        if(head==null || head.next==null)
        return false;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
            
        }
        return false;
    }
}