import java.util.*;
public class conversion
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 2D array");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter the elements at:["+i+"] ["+j+"]");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
        int s=m*n;
        for(int i=0;i<s;i++)
        {
            
                
        