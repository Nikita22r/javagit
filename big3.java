//operators 
//3+5 3 and 5 are operands + is operator following are the some of the //operators supported by java 
// arithematic opertors = these operators are used to perform //mathematical operations +,-,%,*,=,/
// Comparison operators = these operators are used to compare the values
//>,<,=,!=,==.
// Logical operators= these operators are used to combine more than one //comparison operators and(&&) , or(||) , not(!=,<>)
// and = when all conditions are true it will return true ,if anyone //condition fails it will return false .
//or= anyone condition is true it returns true when all conditions //becomes false it retirns false .
//not= its a opposite of and when all condition become false it returns //true if anyone of the condition is false it returns false

// write a prog to find the greatest of three numbers


class big3
{
public static void main(String arg[])
{
int a, b, c;
a=10;
b=20;
c=30;
if(a>b && a>c)
{
System.out.println("a is big");
}
else
{
if(b>c)
{
System.out.println("b is big");
}
else
{
System.out.println("C is big");
}
}
}
}
