/*String class is used to take strings from the console directly.
Each string acts as an object of String class.String class objects
 are immutable(cant be manipulated).code consist of methods of String class*/
 
class LogicString
{
 void stringMethods()
	{
		String s="Hello Students.";
		String s1="Hello students.";
		String s2="Hello HelloHEllo";


		System.out.println("the number of characters + blank spaces in a string are  "+s.length());
		int length = s.length();
		System.out.println("Length:no. of characters and blank spaces of a String is : "+ length);
		
		System.out.println("to find character at the given index starts with 0   "+s.charAt(3));
		System.out.println(s.charAt(s.length()-1));   //s.length()-1 ,cuz index starts with 0
 
/* in predefined class,internally string get stored in private array 
which can't be invoked from outside and that is why its length()-1 
cuz array index is 1 less than the size of array*/
		
		
		String s3=s.concat(s1);
		System.out.println("it will append s1 at the end of s and act as one single string   "+s3);
		
		String s4=s1.concat(s);
		System.out.println("it will append s at the end of s1 and act as one single string   "+s4);
		
		String s5=s+s1; //+ operator is overridden and used to concatenate s with s1
				


		System.out.println("is string starts with hello    "+(s.startsWith("hello")));
		System.out.println("is string ends with ents    "+(s.endsWith("ents.")));  //true
		boolean b=s.endsWith("ents.");
		System.out.println("is string ends with ents    "+b);

		
		
		//returns -1 if not matched
		System.out.println("first occurence of s in s1 is at index    "+s1.indexOf('s'));
		System.out.println("first occurence of s in s1 after index 10    "+s1.indexOf('s', 10));
		System.out.println("first occurence of  string hello in s2 is at index    "+s2.indexOf("Hello"));
		System.out.println("first occurence of string hello in s2 after index 5    "+s2.indexOf("Hello",5));

		System.out.println("last occurence of s in s1 is at index    "+s1.lastIndexOf('s'));
		System.out.println("last occurence of s in s1 after index 5    "+s1.lastIndexOf('s',5));
		System.out.println("last occurence of string s in s1 is at index    "+s1.lastIndexOf("s"));	
		System.out.println("last occurence of string s in s1 after index 5   "+s1.lastIndexOf("s",5));

		String s6 = "one,two,three";
		String[] sa = s6.split(",");
		System.out.println("the  string one will assigned to o index of array   "+sa[0]);
		System.out.println("the  string two will assigned to o index of array   "+sa[1]);
		System.out.println("the string three will assigned to o index of array   "+sa[2]);

		String s7[] = {"one"," two ","three"};
		String s8 = String.join(" ",s7); //first blank argument to tell string type values 
		System.out.println("different strings of array will be joined as one string"+s8);
		

		String s9 = "Welcome to Java";
		String s10 = new String("Welcome to Java");
		String s11 = "Welcome to Java";
		String s12 = new String("Welcome to Java");
		System.out.println("is s9 == s10 ?  " + (s9 == s10));
		System.out.println("is s9 == s11?   " + (s9 == s11));
		System.out.println("is s10 == s12? " + (s10 == s12));




		System.out.println("it will compare the values in the string character by character,by considering case sensitivity   "+ s.equals(s1));
		System.out.println("it will compare the values in the string character by character, by ignoring case sensitivity   "+s.equalsIgnoreCase(s1));

/* in s.compareTo(s1) method, if s=abc and s1=abcde, at c-c =0,the s
 is getting ended so then it will return me the length of remaining 
string as the answer in this case -2  */

		String s13 = new String("Welcome");
		String s14 = "Welcomeab";
		if (s13.compareTo(s14) > 0)   //if it return +number then s13>s14
			{
		System.out.println("s13 is greater than s14."+s13.compareTo(s14));
			}
		else if (s13.compareTo(s14) == 0)  //if it return 0 then s13==s14
			{
		System.out.println("s13 andn s14 have the same contents."+s13.compareTo(s14));
}
		else    //if it return -number then s13<s14
			System.out.println("s13 is less than s14."+s13.compareTo(s14));



		String s15= new String("Welcome");
		String s16 = "WelcoME";
		if (s15.compareToIgnoreCase(s16) > 0) 
			{
		System.out.println("s15 is greater than s16."+s15.compareTo(s16));
			}
		else if (s15.compareToIgnoreCase(s16) == 0) 
			{
		System.out.println("s15 andn s16 have the same contents."+s15.compareTo(s16));
			}
		else
			System.out.println("s15 is less than s16."+s15.compareTo(s16));

	
		String s17="   High LOWHI    ";
		System.out.println("convert whole string in lower letters    "+(s17.toLowerCase()));
		System.out.println("convert whole string in uppercase letters    "+(s17.toUpperCase()));
		System.out.println("omit the leading and trailing blank spaces"+s17.trim()+"hi");
		System.out.println("replace small letter h by capital P in first occurence     "+s17.replace('h','P'));
		System.out.println("replace small string hi by capital PI "  +(s17.replaceFirst("hi","PI")));
		System.out.println("replace ll small string hi by capital pi "  +( s17.replaceAll("hi","Pi")));
	}
}

public class P18String
{
	public static void main(String args[])
	{
		LogicString obj=new LogicString();
		obj.stringMethods();
	}
}



