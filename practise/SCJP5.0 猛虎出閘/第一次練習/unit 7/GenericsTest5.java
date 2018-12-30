import java.util.*;
public class GenericsTest5
{
 public static void main(String argv[])
 {
 	Vector<String>v1=new Vector<String>();
 	Vector<Integer>v2=new Vector<Integer>();
 	Vector<Double>v3=new Vector<Double>();
 	Vector<Short>v4=new Vector<Short>();
 	Vector<Float>v5=new Vector<Float>();
 	Vector<Byte>v6=new Vector<Byte>();
 	Vector<Long>v7=new Vector<Long>();
 	v2.add(new Integer(2));
 	v3.add(new Double(3));
 	v3.add(new Double(4.3));
 	v4.add(new Short((short)3));
 	v5.add(new Float(3));
 	v5.add(new Float(3.2));
 	v6.add(new Byte((byte)2));
 	v7.add(new Long(3));
 	for(Byte data:v6)
 	{
 	 System.out.print(data+"\t");	
 	}	
 	
 

 }		
}	