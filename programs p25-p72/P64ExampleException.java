/*when two exceptions come simultaneously,One of them will be handled,
whichsoever will occur firstly.Once control is exited from the try 
block ,it can not enter in it again*/

class P64ExampleException
{  
  public static void main(String args[])
	{  
   		try
			{  
    			int a[]=new int[5];  
   			 a[5]=30/0;          //2 exception are coming 
//first LHS will get executed and Arithmetic will be thrown 
  			 }  
  		catch(ArithmeticException e)
			{
			System.out.println("task1 is completed");
			}  
  		catch(ArrayIndexOutOfBoundsException g)
			{
			System.out.println("task 2 completed");
			}  
   		catch(Exception e)
			{
			System.out.println("common task completed");
			}  
  
   		System.out.println("rest of the code...");  
 	}  
} 