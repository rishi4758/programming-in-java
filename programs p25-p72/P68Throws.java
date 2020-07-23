/*Exception are of two types: Checked and unchecked. 
Checked cannot be handled so they hace to be declared using "throws" keyword
unchecked can be handled using try catch.In propagation an exception 
have to be either declared ,handled or both.If you do not do any of this. CTE "uncaught 
exception" will come*/

import java.io.IOException;    //checked exception
class Throws1
{
//declaration syntax at the end of method name 
	void x() throws IOException     //thid declared and handles 
		{
			//try{      //handled
			throw new IOException();
		}
	void y() throws IOException   //declared so handler is optional
		{
		x();
		}
	void z()//throws IOException  //declared so handler is optional		
		{ try{
			y();}
		catch(Exception a)
{}
		}
	}

class P68Throws
{
    public static void main(String r[])throws IOException //declared so handler is optiona
     {
	Throws1 obj=new Throws1();
	obj.z();
      }
}