/*Use 2 of throw keyword: for rethrow exception to place of call */

class LogicEHWithReThrow
{
	void rethrowCode()
	{
		try 
		   {
		throw new ArithmeticException("this is not allowed");
	          }

		catch (NullPointerException e) 
		   {
		System.out.println("try belongs to call area  "+e);
		   throw e;    
/*rethrow will throw the exception to the place,from where the call
 to the method rethrowCode()is made. Exception is thrown to call area 
.So that too should put under try catch to handle the rethrown exception*/
		    }

		
	}
}
class P65EHWithReThrow
{
	public static void main(String arr[])
		{ 
		  try     //area where exception is rethrown
		   { 
		LogicEHWithReThrow obj=new LogicEHWithReThrow();
			obj.rethrowCode();
		   }

		catch (NullPointerException e) 
		   {
		System.out.println("in main   "+e);
		   }

		
  	}
}  