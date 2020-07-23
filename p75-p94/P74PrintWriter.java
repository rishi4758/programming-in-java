/*for Char oriented write we have class: PrintWriter and it has overloaded
 printand prinln methods to write different type of data to file*/

import java.io.*;
public class P74PrintWriter 
{
	public static void main(String[] args) throws Exception  //exception declared so not handled
	 { File f=new File("abc.txt");
		f.createNewFile();
		PrintWriter output = new PrintWriter(f);
		output.print("Java class ");
    		output.println(40);
    		output.print("LPU ");
    		output.println(85.5);
    		output.print('a');
		output.close();
    		
	}
}
