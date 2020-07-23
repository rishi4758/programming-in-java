/*reading detail of object from a file is called deserialisation 
because it is first converted from bytecode into readable form.
It is achieved by using class ObjectInputStream */

import java.io.*;
class P81ObjectOSDeserialize
{
	public static void main(String args[])
	 {
		try {
	FileInputStream fis = new FileInputStream("serial.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	ObjectOS objd = (ObjectOS)ois.readObject();   //to convert bytecode into redable object of ObjectOS class
	ois.close();
	System.out.println("object deserialise: " + objd);
 		 }
		catch(Exception e) {
	System.out.println("Exception during deserialization: " + e);
		}
 	 }
}

