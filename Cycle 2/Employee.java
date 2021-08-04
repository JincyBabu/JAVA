import java.util.*;
class Employee
{
int eNo;
String eName;
float eSalary;
public void getdata()
{
Scanner s = new Scanner(System.in);
System.out.println("enter the employee number : ");
eNo=s.nextInt();
System.out.println("enter the employee name : ");
eName=s.next();
System.out.println("enter the employee salary : ");
eSalary=s.nextFloat();
}
public void display()
{
System.out.println("\nemployee number : " +eNo);
System.out.println("employee name : " +eName);
System.out.println("employee salary : " +eSalary);
}
public static void main(String args[])
{
int n=0;
Scanner s1 = new Scanner(System.in);
System.out.println("enter the limit :");
n=s1.nextInt();
Employee e[]=new Employee[n];
for(int i=0; i<n; i++)
{
e[i]=new Employee();
e[i].getdata();
}
System.out.println("\n***EMPLOYEE DETAILS***");
for(int i=0; i<n; i++)

{
e[i].display();
}
System.out.println("\nenter the id of employee to search : ");
int no=s1.nextInt();
for(int i=0; i<n; i++)
{
if(e[i].eNo==no)
{
System.out.println("employee id exist");
System.out.println("id of employee : "+e[i].eNo);
System.out.println("name of employee : "+e[i].eName);
System.out.println("Salary of employee : "+e[i].eSalary);
break;
}
if(i==n-1)
{
System.out.println("employee id not exist");
break;
}
}
}
}