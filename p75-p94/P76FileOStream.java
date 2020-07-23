//for byte oriented write we have class: FileOutputStream
import java.util.*;
import java.io.*;
public class P76FileOStream
 {
	public static void main(String[] args) throws Exception
	{
	
/*if no zxc named file exist, a new will created because 
fileoutputStream if write mode*/

	FileOutputStream fout= new FileOutputStream("zxc.txt");
		//String s="whatever  fkjw wgff kshf";   //implicit
		
		Scanner sc=new Scanner(System.in);   //given by user
		String s=sc.next();   
		s=s+sc.nextLine();	 //to take space separated string	
	
		byte a[]=s.getBytes();   //convert char of string int bytes
		fout.write(a);     //it has write method to write data to the file
		fout.close();
		System.out.println("saved to all named file");
    		
	}
}
