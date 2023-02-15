abstract class Demo
{
abstract void test();
abstract void cool();
}
abstract class Sample extends Demo
{
void test()
{
System.out.println("hi");
}
abstract void cool();
}
class tester extends Sample
{
void cool()
{
System.out.println("hello");
}
}
class Mainclass 11
{
public static void main(String...args)
{
tester t=new tester();
t.test();
t.cool();
}
}