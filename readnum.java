// write a program to read 3 digit number and display indiviual digits
import java.util.*;
class readnum
{
public static void main(String arg[])
{
int num ,temp;
num=342;
while(num>0)
{
temp=num%10;
System.out.println(temp);
num=num/10;
}
}
}