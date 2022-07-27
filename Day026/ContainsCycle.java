package LinkedList;

public class ContainsCycle {
    public static void main(String[] args) {
        CircularLinkedList cl=new CircularLinkedList();
        cl.insert(1);
        cl.insert(4);
        cl.insert(2);
        cl.insert(3);
        cl.checkCycle();
    }
     public boolean checkCycle(Node head)
    {
       Node temp=head;
       while(temp!=null)
       {
           if(temp.next==head)
           {
               return true;
           }
           temp=temp.next;
       }
       return false;
    }

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
}

