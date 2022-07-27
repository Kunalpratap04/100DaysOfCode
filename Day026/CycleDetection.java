package LinkedList;

public class CycleDetection {
    static class Node
    {
        int value;
        Node next;
        Node(int value, Node next)
        {
            this.value=value;
            next=null;
        }
        Node (int value)
        {
            this.value=value;
        }

    }
    public boolean hasCycle(Node head)
    {
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null )
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                return true;
            }

        }
        return false;
    }
    public int cycle(Node head)
    {
        Node fast=head;
        Node slow=head;
        int count=0;
        while(fast!=null && fast.next!=null )
        {
            fast=fast.next.next;
            slow=slow.next;
            count+=1;
            if(fast==slow)
            {
                return count;
            }

        }
        return 0;
    }
}
