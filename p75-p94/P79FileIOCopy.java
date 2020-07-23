/*to copy content of one file to another file: the file from which 
you want to read, open it in read mode. the file in which 
you want to write, open it in write mode. */

import java.io.*;
public class P79FileIOCopy
 {
  public static void main(String[] args) throws Exception 
	{
		FileInputStream fin = new FileInputStream("all.txt"); read mode
    		OutputStream fout = new FileOutputStream("all1.txt",true);   //upcasting write mode.true is for append mode
    		int c=0;
   		 while ((c = fin.read()) != -1) 
			{
      			System.out.print((char) c);
      			fout.write((char) c);
    			}
    		fin.close();
    		fout.close();
	}
}