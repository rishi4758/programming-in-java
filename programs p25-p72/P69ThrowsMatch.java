import java.io.IOException;
class LogicThrowsMatch
{
	void x() throws IOException     //declared but not handled
		{
			throw new IOException("device error");
		}
	void y() throws IOException   //declared so handler is optional
		{
			x();
		}
	void z()  //handled usif try catch		
		{ 
			try
			{ y(); }
			catch(Exception e)
			{
			System.out.println("hanled in z before propagated to amin ");
			}
		}
	}

class P69ThrowsMatch
{
    public static void main(String r[])   
/*neither declaration,nor handling cuz exception is handled before
 coming to main method, by the Z itself */
     {
	LogicThrowsMatch obj=new LogicThrowsMatch();
	obj.z();

      }
}
