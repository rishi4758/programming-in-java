// Java program to demonstrate Wrapping and UnWrapping
// in Java Classes

class P53WrappingUnwrapping
{
    public static void main(String args[])
    {
        byte a = 1;       //  byte data type
        Byte byteobj = new Byte(a);  // wrapping around Byte object
    
     int b = 10;       // int data type
     Integer intobj = new Integer(b);//wrapping around Integer object
 
        
        float c = 18.6f;    // float data type
        Float floatobj = new Float(c); // wrapping around Float object
 
        double d = 250.5;      // double data type
        Double doubleobj = new Double(d);  // Wrapping around Double object
 
        char e='a';    // char data type
        Character charobj=e;    // wrapping around Character object
 
        // (printing the values from objects)

        System.out.println("Values of Wrapper objects (printing as objects)");
        System.out.println("Byte object byteobj:  " + byteobj);
        System.out.println("Integer object intobj:  " + intobj);
        System.out.println("Float object floatobj:  " + floatobj);
        System.out.println("Double object doubleobj:  " + doubleobj);
        System.out.println("Character object charobj:  " + charobj);
 
        
	// objects to data types (retrieving data types from objects)
        // unwrapping objects to primitive data types
        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;
 
        // printing the values from data types
        System.out.println("Unwrapped values (printing as data types)");
        System.out.println("byte value, bv: " + bv);
        System.out.println("int value, iv: " + iv);
        System.out.println("float value, fv: " + fv);
        System.out.println("double value, dv: " + dv);
        System.out.println("char value, cv: " + cv);


	int aa=intobj.intValue();
	System.out.println(aa);

	byte bb=byteobj.byteValue();
	System.out.println(bb);

	int cc=intobj.compareTo(intobj);
	System.out.println(cc);
	
	Integer dd =(Integer)Integer.valueOf(aa);
	System.out.println("rgsdrgsdtgsrthtrsh"+dd);
	
	String ee=intobj.toString();
	System.out.println(ee);

	int ff=Integer.parseInt("34");
	System.out.println(ff);
	
    }
}