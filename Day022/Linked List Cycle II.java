public class Solution {
    public ListNode detectCycle(ListNode head) {
       if(length(head)==0)
       return null;
        ListNode f=head;
       ListNode s=head;
        int l=length(head);
        while(l>0)
        {
            s=s.next;
            l--;
        }
        while(f!=s)
        {
            f=f.next;
            s=s.next;
        }
        return s;
    }
   static int length(ListNode head)
   {
       ListNode fast=head;
       ListNode slow=head;
       int length=0;
       while(fast!=null&&fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast)
           {
               do{
                  length+=1;
                   slow=slow.next;
               }
               while(slow!=fast);
               return length;
           }
       
       }
       return 0;
   }
}
