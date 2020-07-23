/*When we try to print object directly, It internally calls toStrig 
method .*/
class CE extends Exception 
{
	private int detail;
	CE(int a) 
	{
	detail = a;
	}
	public String toString()
	{
	return "hey exception came";
	}
}
class P72CustomExceptionWithtoString
{
	static void compute(int a)
	{ 	try
			{
			if(a > 10)
		     	throw new CE(a);
			}
		catch(CE ab)
			{
			System.out.println("Caught " + ab.toString());
			}
	}
	public static void main(String args[]) 
		{
			try 
			{
			compute(20);
			} 
			catch (Exception e) 
			{
			 System.out.println("Caught " + e);   //object call ,calling overridden toString methos
			}
		  }
}
