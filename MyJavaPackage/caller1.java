import java.util.*;
public class caller1 extends caller
{
public static void main()
{
Scanner sc=new Scanner (System.in);
System.out.println("ENTER THE LENGTH FOR THE CUBE");
int l= sc.nextInt();
System.out.println("ENTER THE radius and height of cylinder");
int r= sc.nextInt();
int h=sc.nextInt();
System.out.println("ENTER THE LENGTH, BREADTH & HEIGHT FOR THE CUBE");
int l1= sc.nextInt();
int b= sc.nextInt();
int h1= sc.nextInt();
volume obj= new volume ();
obj.volume(l);
obj.volume(r,h);
obj.volume(l1,b,h1);
}
}
