/*generic interface,same as that of class,Instead of keyword class
interface will be written */

interface a<T>
{
 T max(T z);   //generic methos declaration in interface
}
/*class implements genric interface should be of type generic with 
same number of arguments*/
class P88InetrfaceGenerics<T> implements a<T>   
{
public T max(T z)   //defination of max() of interface with string access specifier
{
return z;
}

public static void main(String args[])
{
P88InetrfaceGenerics<Integer> obj =new P88InetrfaceGenerics<Integer>();
int abc=obj.max(33);
System.out.println(abc);
}
}