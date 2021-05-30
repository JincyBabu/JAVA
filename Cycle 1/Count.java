import java.util.Scanner;

class Count
{
    public static void main(String[] args) 
    {
        int n,x,count=0,i=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        n = s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements : ");
        for(i=0;i < n;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element to count the number of occurrences ? ");
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                count++;
            }
        }
        System.out.println("Number of occurrences : "+count);
    }
}