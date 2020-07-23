/*This program showing the case when there is no matching catch block
defined to handle the occured exception and a finally block is there.
First finally has to be executed and then implicitly handler will 
become active*/

class P63FinallyWithNoMatchingCatch
{  
  public static void main(String args[])
   {  
     try
	{  
   	int data=25/0;  
   	System.out.println(data);  
  	}  
     catch(NumberFormatException e)
	{
	System.out.println(e);
	}  
      catch(NullPointerException e)
	{
	System.out.println(e);
	}  
     finally
	{
	System.out.println("finally block is always executed");
	}  
   }
  
} 