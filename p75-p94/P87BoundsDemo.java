/* Bounded generic: when i want to constraint that user can give any type
of data  but out of numeric list only.It is done using "extends" 
keyword. Program to check whether the average of two array objects is same or not ?*/

class Stats<T extends Number>   //bounded generic
{
	T[] nums;     //generic array data member
	Stats(T[] ob)  //generic constructor
		{
		nums = ob;
		}
	double average() 
		{
		double sum = 0.0;
		for(int i=0; i < nums.length; i++)
		sum += nums[i].doubleValue();  //convert object in double primitive data type			return sum / nums.length; 
		return sum/nums.length;
		}
}

class P87BoundsDemo 
{	
	public static void main(String args[]) 
	{		
		Integer inums[] = { 1, 2, 3, 4, 5 };  //array of Integer objects
		Stats<Integer> iob = new Stats<Integer>(inums);	
		double v = iob.average();
		System.out.println("iob average is " + v);
		
		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };	 //array of Double objects	
		Stats<Double> dob = new Stats<Double>(dnums);		
		double w = dob.average();		
		System.out.println("dob average is " + w);	
	}
} 
