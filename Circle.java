class Circle
{
static void area()
{
int r=5;
final double pi=3.142;
double result=r*r*pi;
System.out.println(result);
}
class Sample2
{
public static void main(String[]args)
{
Circle C1=new Circle();
C1.area();
}
}
}