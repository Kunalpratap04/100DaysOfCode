 */
class Solution {
    public ListNode mergeTwoLists(ListNode t1, ListNode t2) {
       
 if(t1==null)
     return t2;
        if(t2==null)
            return t1;
if(t1.val>t2.val)
{
    ListNode temp=t1;

        t1=t2;
        t2=temp;
}
 ListNode res=t1;
        while(t1!=null && t2!=null)
        {
            ListNode tmp=null;
            while(t1!=null && t1.val<=t2.val)
            {
                tmp=t1;
                t1=t1.next;
            }
            tmp.next=t2;
            ListNode temp=t1;
            t1=t2;
            t2=temp;
        }
        return res;

    }
}
