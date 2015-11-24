//HARSHIT DANG XI A
import java.util.*;
public class tester
{
    public static void main()
    {
        int no;
        linklist obj=new linklist();
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Enter the element at the beginning");
        System.out.println("2. Enter the element at the middle");
        System.out.println("3. Enter the element at the end");
        System.out.println("4. Delete the element at the beginning");
        System.out.println("5. Delete the element at the middle");
        System.out.println("6. Delete the element at the end");
        System.out.println("7. Split the linklist");
        System.out.println("8. Display");
        System.out.println("9. Exit"); 
        while(true)
        {
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter the no.");
                no=sc.nextInt();
                obj.insertFirst(no);
                break;
                case 2: System.out.println("Enter the position and no.");
                int p=sc.nextInt();
                no=sc.nextInt();
                obj.insertMid(p,no);
                break;
                case 3: System.out.println("Enter the no.");
                no=sc.nextInt();
                obj.insertEnd(no);
                break;
                case 4:
                System.out.println("Element deleted from the beginning");
                obj.deleteBeg();
                break;
                case 5:System.out.println("Enter the position of the element you want to delete");
                int po=sc.nextInt();
                System.out.println("Element deleted from the middle");
                obj.deleteMid(po);
                break;
                case 6:System.out.println("Element deleted from the end");
                obj.deleteLast();
                break;
                case 7:System.out.println("Enter the position");
                int poss=sc.nextInt();
                obj.split(poss);
                break;
                case 8: obj.show(obj.start);
                break;
                case 9: System.exit(0);
                break;
                default:System.exit(0);
            }
        }
    }
}

