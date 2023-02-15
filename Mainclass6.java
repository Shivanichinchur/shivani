class Vehicle
{
void noise()
{
System.out.println("any noise");
}
}
class Car extends Vehicle
{
void noise()
{
System.out.println("sound1");
}
}
class Bike extends Vehicle
{
void noise()
{
System.out.println("sound2");
}
}
class Bus extends Vehicle
{
void noise()
{
System.out.println("sound3");
}
}
class Sample
{
static void ansim(Vehicle v1)
{ 
v1.noise();
}
}
class Mainclass6
{
public static void main(String[] args)
{
Car c1=new Car();
Bike b1=new Bike();
Bus b2=new Bus();
Sample.ansim(c1);
Sample.ansim(b1);
Sample.ansim(b2);
}
}