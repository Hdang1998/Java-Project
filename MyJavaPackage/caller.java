import java.util.*;
public class caller
{
public static void main()
{
Scanner sc= new Scanner (System.in);
System.out.println("Enter the radius of the circle");

double r=sc.nextInt();
System.out.println("Enter the length an breadth of the rectangle");
int l=sc.nextInt();
int b=sc.nextInt();
System.out.println("Enter the side of the square");
int s=sc.nextInt();
area obj=new area();
obj.area (r);
obj.area (l,b);
obj.area (s);
}
}

