/* this program will be working on formats of date and time.When user
 want to change the order of date and time format*/
import java.time.format.*;
import java.time.*;
class LogicDateTimeFormat 
{
	void formatOfDateTime()
	{
	LocalDateTime obj=LocalDateTime.now();  
        System.out.println("Before Formatting: " + obj);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = obj.format(format);  
        System.out.println("After Formatting: " + formatDateTime);  
	}
}

class P34DateTimeFormat
{
	public static void main(String args[])
	{
	LogicDateTimeFormat obj=new LogicDateTimeFormat();
	obj.formatOfDateTime();
	}
}