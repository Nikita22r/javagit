//write a program to read a number and reverse it .

class revnum
{
public static void main(String arg[])
{
int num, temp,rev=0;
num=342;
while(num>0)
{
temp=num%10;
rev=rev*10+temp;
num=num/10;
}
System.out.println(rev);

}
}