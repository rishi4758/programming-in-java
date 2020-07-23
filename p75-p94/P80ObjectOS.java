/*writing detail of object to a file is called serialisation because 
it is first converted into bytecode.
It is achieved by using class ObjectOutputStream */

import java.io.*;
class ObjectOSSerialize implements Serializable 
	{
		String s;
		int i;
		double d;
	 ObjectOSSerialize(String s, int i, double d) 
		{
		this.s = s;
		this.i = i;
		this.d = d;
	     }
	public String toString() 
		{
		     return "s=" + s + "; i=" + i + "; d=" + d;
		}
     }


class P80ObjectOSSerialize
{
	public static void main(String args[])  //no declare but handler
	 {
		try 
		   {
	ObjectOSSerialize obj = new ObjectOSSerialize("Hello", -7, 2.7e10);
	System.out.println("obj1: " + obj);
	FileOutputStream fos = new FileOutputStream("serial.txt");   //write mode of file in which you want to wrte the object
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(obj);  //method to write object
	oos.close();
		      }
		catch(IOException e) 
		   {
	System.out.println("Exception during serialization: " + e);
		      }
}
}
