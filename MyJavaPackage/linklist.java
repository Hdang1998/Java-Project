//HARSHIT DANG XI A
class linklist
{
    Node start,start1,ptr;
    Node createNode(int ele)
    {
        Node newnode=new Node(ele);
        return newnode;
    }

    void insertFirst(int e)
    {
        Node temp;
        Node n=createNode(e);
        if(start==null)
            start=n;
        else
        {
            temp=start;
            start=n;
            n.next=temp;
        }
        temp=null;
    }

    void insertMid(int pos,int ele)
    {
        Node n=createNode(ele);
        Node temp,ptr;
        int count=1;
        ptr=start;
        while(count<pos)
        {
            ptr=ptr.next;
            count=count+1;
        }
        n.next=ptr.next;
        ptr.next=n;
    }

    void insertEnd(int ele)
    {
        Node n=createNode(ele);
        Node temp;
        ptr=start;
        while(ptr.next!=null)
        {
            ptr=ptr.next;
        }
        ptr.next=n;
    }

    int deleteBeg()
    {
        if(start==null)
        {
            System.out.println("Underflow");
            return -9999;
        }
        int val=start.data;
        start=start.next;
        return val;
    }

    int deleteLast()
    {
        Node ptr,ptr1;
        ptr=ptr1=start;
        while(ptr.next!=null)
        {
            ptr1=ptr;
            ptr=ptr.next;
        }
        int val=ptr.data;
        ptr1.next=null;     //breaking the link
        ptr=null;
        return val;
    }
    void deleteMid(int pos)
    {
        Node ptr,ptr1;
        ptr=ptr1=start;
        int ctr=1;
        while(ctr<pos)
        {
            ptr=ptr1;
            ptr1=ptr1.next;
            ctr++;
        }
        ptr.next=ptr.next.next;
        ptr1.next=null;
    }
    void split(int pos2)
    {
        Node ptr,ptr1;
        ptr=ptr1=start;
        int ctr=1;
        while(ctr<pos2)
        {
            ptr=ptr1;
            ptr1=ptr1.next;
            ctr++;
        }
        start1=ptr.next;
       ptr.next=null;
       show(start);
        System.out.println();
        show(start1);
    }
    void merge(Node top,Node top1)
    {
        Node ptr=top;
        while(ptr!=null)
        {
            ptr=ptr.next;
        }
        ptr=top1;
        show(top);
    }
    void show(Node top)
    {
        ptr=top;
        while(ptr!=null)
        {
            System.out.print(ptr.data+"---->");
            ptr=ptr.next;
        }
        System.out.println();
    }
}