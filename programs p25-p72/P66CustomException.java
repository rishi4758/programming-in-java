/*Use 3 of throw :for custom exception.To create user defined exception
there must be one user defined class acting as exception name.That 
must extends Exception class.That must have a constructor ,so that object
 can be created*/


class MyException extends Exception 
{
	private int detail;
	MyException(int a) 
	{
	detail = a;
	}
	public String toString()   //toString called internally,when object is printed
	{
	 return "MyException[" + detail + "]";
	}
}
class P66CustomException
{
	static void compute(int a) throws MyException 
		{
		     System.out.println("Called compute(" + a + ")");
		     if(a > 10)
		     throw new MyException(a);   
 //constructor call and it will throw the exception to called area
		     System.out.println("Normal exit");
		}
		    	
	public static void main(String args[]) 
		{
				try  
 //called area in try catch to handle thrown exception
				{
				 compute(1);   //no exception
				 compute(20);   //exception
				} 
				catch (MyException e) 
				{
				  System.out.println("Caught ghj " + e);
				}
		   	}
}
