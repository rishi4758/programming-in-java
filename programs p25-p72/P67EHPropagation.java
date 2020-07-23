/*This program will show the sequence in which the sequence of exception
 being handled or thrown is shown.It is maintained main stack.*/

class P67EHPropagation
{
/*x is the method where actual exception came or to be thrown from.
For handling it will be thrown to the method who called x i.e. y().*/
   void x()    
  {
	throw new ArithmeticException();
   }
/* It is not having handler i.e. try catch. So again thrown to the 
method who called y() i.e. z(). */
   void y()  
     {
	x();   //go to x()
     }
   
/* now Z is having try catch ,If the matching try catch found,It 
will be handled here only otherwise,exception will be thrown to 
the method who called z().*/
     void z()   
		{
	try
		{ 
		y();    //go to y()
		}
	catch(NumberFormatException a)
		{
		System.out.println("no matching catch ");
		}
      }
  public static void main(String r[])
   {
	try
		{
		P67EHPropagation obj=new P67EHPropagation();
		obj.z();           //go to z method
	}
	catch(Exception a)  
//if it is also not having matching catch, implicit handler willbecome active
		{
		System.out.println("this catch is matched with thrown exception");
		}
    }
}