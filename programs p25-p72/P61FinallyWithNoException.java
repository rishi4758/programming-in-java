/*finally block: whether exception comes or not, finally block will 
always run.This program is the case when no exception comes.*/
class P61FinallyWithNoException
{  
  public static void main(String args[]){  
  try
	{  
   	int data=25/5;     //no exception came
   	System.out.println(data);  
  	}  
  catch(NullPointerException e)
	{
	System.out.println(e);
	}  

  finally    //finally block 
	{
	System.out.println("finally block is always executed");
	}  

  System.out.println("rest of the code...");  
  }  
}  