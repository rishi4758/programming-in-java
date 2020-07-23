/*Use 1 of throw keyword: for customized message. "throw" keyword is
used to throw the exception explicitly.When we want to wrap a message
 with the exception being thrown.First catch block will get executed 
and then the wrapped customized message will get printed*/

class P64EHWithThrowMessage
{
   public static void main(String arr[])
	{ 
	  try 
	     {
		throw new ArithmeticException("this is not allowed");
	     }
          catch (ArithmeticException e) 
	     {
		System.out.println("Second number must be non-zero   ");
             }
	   catch (Exception a) 
	     {
		System.out.println("Invalid Number of arguments   "+a);
	     }
        }
}  