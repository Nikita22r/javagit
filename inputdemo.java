//write a program to read value from user and display the same.
//nextInt()=number
//nextFloat()=Float
//nextdouble()=double
//nextLine()=char


import java.util.*;
class inputdemo
{
public static void main(String arg[])
{
int num;
Scanner s1=new Scanner(System.in);
System.out.println("Enter a number");
num=s1.nextInt();
System.out.println(num);
}
} 