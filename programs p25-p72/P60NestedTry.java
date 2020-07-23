//try catch within another try block
class P60NestedTry
{  
 	public static void main(String args[])
	{  
 	 try //outer try block
	{  
    		try   //inner try block
			{  
     			System.out.println("going to divide");  
     			int b =39/0;  
    			}
		catch(ArithmeticException e)
			{
			System.out.println(e);
			}  
   
    		try  //another inner try block
			{  
    			int a[]=new int[5];  
    			a[5]=4;  
    			}
		catch(ArithmeticException e)
			{
			System.out.println(e);
			}  
     
    	 System.out.println("other statement");  
 	}	
	catch(NullPointerException e) 
  
/*outer catch:if no inner catch block matches,control will transfer 
to outer catch block,if its still not matching then implicit handler 
will become active.*/ 

		{
		System.out.println("handeled");
		}  
  
  	System.out.println("normal flow..");  
 }  
}  