import java.util.Scanner;

public class StudentMarks
{
public static void main(String args[]) 
{
String name;
int n, rollno, total=0 ;
float percentage;
Scanner s=new Scanner(System.in);
System.out.print("Enter name of the Student : ");
name=s.nextLine();
System.out.print("Enter Roll number : ");
rollno=s.nextInt();   
System.out.print("Enter the number of Subjects : ");
n=s.nextInt();
int marks[]=new int[n];
System.out.println("***Enter marks secured in each subject out of 100***");
for(int i = 0; i < n; i++)
{
marks[i] = s.nextInt();
total = total + marks[i];
}
percentage = total / n;

System.out.println("Roll number : " +rollno);
System.out.println("Name of the Student : "+name);
System.out.println("Total marks obtained : "+total);
System.out.println("Percentage : "+percentage);
}
}