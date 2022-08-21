class Solution {
    public ListNode swapNodes(ListNode head, int k) {
         ListNode temp =head,temp1=head;
ListNode node1=null, node2=null;
        int size =0;
       while(temp!=null)
      {
          
         size=size+1;
           if(size==k){
               node1=temp;
              

              }
           
           temp=temp.next ;              
      }
       int s=size-k+1;
        int i=1;
        while( i<=s)

      {

           if(i==s){
              node2=temp1;
              }
            temp1=temp1.next;  

          i=i+1;

      }
        int t=node1.val;
        node1.val=node2.val;
        node2.val=t;
        
        return head;
    }
}
