class Ola
{
void ride()
{
System.out.println("riding");
}
}
class Car extends Ola
{
void ride()
{
System.out.println("go");
}
}
class Bike extends Ola
{
void ride()
{
System.out.println("move");
}
}
class Auto extends Ola
{
void ride()
{
System.out.println("tururu");
}
}
class Sample
{
static void ansim(Ola o1)
{ 
o1. delivery();
}
}
class Mainclass3
{
public static void main(String[] args)
{
Car c1=new Car();
Bike b1=new Bike();
Auto a1=new Auto();
Sample.ansim(c1);
Sample.ansim(b1);
Sample.ansim(a1);
}
}