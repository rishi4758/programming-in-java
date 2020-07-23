//byte oriented read we have class"FileInputStream

import java.util.*;
import java.io.*;
public class P77FileIStream
 {
	public static void main(String[] args) 
	{		
		try
		{
		 int answer=0;
		FileInputStream fin= new FileInputStream("zxc.txt");  //open zxc in read mode
			while((answer=fin.read())!=-1)   //read method returns -1 if reaches to end of file
			{
                    		System.out.print((char)answer);	 //convert byte into character
 			}
		}
		catch(Exception a)
		{
		System.out.print("exception handled so not declared");
		}
	}
}
