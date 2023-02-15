class Demo
{
int x=10;
}
class Sample extends Demo
{
void disp()
{
System.out.println("cool");
}
}
class Mainclass
{
public static void main(String[]args)
{
//upcasting
Demo z=new Sample();
Demo z=(Demo)new Sample();
System.out.println(z.x);
//downcasting
Sample s=(Sample)z;
s.disp();
System.out.println(.x);
}
}