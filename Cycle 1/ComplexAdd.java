import java.util.Scanner;

class Complex
{
int real,img;
Complex()
{
}
Complex(int r,int i)
{
real=r;
img=i;
}
Complex AddComplex(Complex c1,Complex c2)
{
Complex c=new Complex();
c.real=c1.real+c2.real;
c.img=c1.img+c2.img;
return c;
}
void getdata()
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of Real Part: ");  
real=s.nextInt();
System.out.print("Enter the value of Image part : ");
img=s.nextInt(); 
}
}
class ComplexAdd
{
public static void main(String arg[])
{
Complex c1=new Complex();
c1.getdata();
Complex c2=new Complex();
c2.getdata();
Complex c3=new Complex();
c3=c3.AddComplex(c1,c2);
System.out.println("Sum of Complex Numbers : " + c3.real + "+" + c3.img +"i");
}
}