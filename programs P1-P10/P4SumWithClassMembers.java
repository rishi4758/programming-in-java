/* A class has body ,Set of data members and set of member 
methods(functions). Data members are properties of objects.Member 
methods are behaviour of objects.

class SumWithClassMembers
{
data members;   //declare properties of objects
member methods  // logic in methods body
}   */

class SumWithClassMembers
{
int a;       //a and b are data members
int b;
void sum()      //member method
{a=9;
b=10;
int c=a+b;
System.out.println("sum is "+c);
}
}
public class P4SumWithClassMembers
{public static void main(String args[])
{ 
SumWithClassMembers obj=new SumWithClassMembers();
obj.sum();
}
}


