//While loop = its a entry control loop , when we dont know the number of //repeatations we use this loop, in this loop initialization , condition , //increment or decrement are given in separate lines , first we initialize //the value then this value will be checked with a condition , if the //condition is true it will execute the code else it will terminate .
//Syntax = Start
         // while(condition)
	 // {
	 //  incr/decr
	//  }

// write a program to display the numbers from 1-10 using while loop.


class whiledemo
{
public static void main(String arg[])
{
int i;
i=1;
while(i<=10)
{
System.out.println(i);
i++;
}
}
}