class Order
{
void delivery()
{
System.out.println("any delivery");
}
}
class Zomato extends Order
{
void delivery()
{
System.out.println("food");
}
}
class Amazon extends Order
{
void delivery()
{
System.out.println("phone");
}
}
class Flipkart extends Order
{
void delivery()
{
System.out.println("clothes");
}
}
class Sample
{
static void ansim(Order o1)
{ 
o1. delivery();
}
}
class Mainclass4
{
public static void main(String[] args)
{
Zomato z1=new Zomato();
Amazon a1=new Amazon();
Flipkart f1=new Flipkart();
Sample.ansim(z1);
Sample.ansim(a1);
Sample.ansim(f1);
}
}