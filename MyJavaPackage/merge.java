import java.util.*;
public class merge
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        linklist obj2=new linklist();
        linklist obj3=new linklist();
        System.out.println("Enter the number of elements you want to enter in the first linklist");
        int num=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<num;i++)
        {
            int e=sc.nextInt();
        obj2.insertFirst(e);
    }
        System.out.println("Enter the elements you want to enter in the second linklist");
        int num2=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<num2;i++)
        {
            int e=sc.nextInt();
        obj3.insertFirst(e);
    }
        linklist obj4=new linklist();
        obj4.merge(obj2.start,obj3.start);
    }
}
        
