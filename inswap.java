//Interchange two numbers without using third variable.

class inswap
{
public static void main(String arg[])
{
int a , b;
a=10;
b=20;
a=a+b; //30
b=a-b; //-10
a=a-b; //20
b=a-b; 
System.out.println(a);
System.out.println(b);
}
}