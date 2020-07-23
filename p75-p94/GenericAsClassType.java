class Student
{
	String name;
	int rollno;
	Student( String n,int r)
	{
           name =n;
	   rollno=r;
	}
	
	public String toString()
	{
	return name+ ""+rollno;
	}

}
class LogicGen<Student>     
{
	Student ob;     
	Student get(Student ob)  
		{
		this.ob=ob;
		return ob;
		}

	void belonging()
			{  
	System.out.println("anything is" +ob.getClass().getName());
			}
}
class P86GenericAsClassType
{
	public static void main(String args[])
		{
		LogicGen<Student> obj=new LogicGen<Student>(); 
		Student a=obj.get(new Student("abc",1));  
		System.out.println(""+a);
		obj.belonging();
}
		
		
}
	