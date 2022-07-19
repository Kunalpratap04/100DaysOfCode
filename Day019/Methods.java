package LinkedList;

public class Methods {
    static class Node
    {
        int value;
        Node next;
        Node(int value,Node next)
        {
            this.value=value;
            next=null;
        }
        Node (int value)
        {
            this.value=value;
        }

    }
     Node head=null;
    public static void main(String[] args) {
        Methods list = new Methods();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
        list.insertSpecific(1,78);
        list.display();
        list.DeleteGivenPos(0);
        list.display();
    }
     void insertFirst(int val)
    {
        Node n=new Node(val);
        n.next=head;
        head=n;

    }
     void insert(int val)
    {
        Node n=new Node(val);
        Node temp=head;
        if(temp==null)
        {
              head=n;
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;
   }
    void insertSpecific(int pos,int val)
    {
        Node n=new Node(val);
        Node temp=head;
        int i=0;
        while(i!=pos)
        {
            temp=temp.next;
            i++;
        }
        n.next=temp.next;
        temp.next=n;
    }
    void DeleteFirst()
    {
       head= head.next;
    }
    void DeleteGivenPos(int pos)
    {
        int i=0;// for zero based indexing
        
        Node temp=head;
        if(pos==0)
        {
            head=head.next;
            return;
        }
        while(i<pos-1)
        {
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
    }
     void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value +" --> ");
            temp=temp.next;
        }
        System.out.println();
    }



}
