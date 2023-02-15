class Bird
{
void noise()
{
System.out.println("some noise");
}
}
class Parrot extends Bird
{
void noise()
{
System.out.println("chuchu");
}
}
class Crow extends Bird
{
void noise()
{
System.out.println("cawcaw");
}
}
class Pigeon extends Bird
{
void noise()
{
System.out.println("pipi");
}
}
class Sample
{
static void ansim(Bird b1)
{ 
b1.noise();
}
}
class Mainclass2
{
public static void main(String[] args)
{
Parrot p1=new Parrot();
Crow c1=new Crow();
Pigeon p2=new Pigeon();
Sample.ansim(p1);
Sample.ansim(c1);
Sample.ansim(p2);
}
}