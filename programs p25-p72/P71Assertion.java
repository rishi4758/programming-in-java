/*It is also same as that of Exception handling. Only difference is
 no need to handle or delare the exception, It is used for testing
 purpose.  compile sameas other programs. To run : java -ea "name of 
class has main" */

import java.util.*;
class P71Assertion
{
public static void main(String ar[])
{
Scanner sc=new Scanner (System.in);
System.out.println("enter age");
int age=sc.nextInt();
assert age>18:"you are not allowed to vote";   
 //one liner ,assert keyword to show that thisis assertion statement
}}