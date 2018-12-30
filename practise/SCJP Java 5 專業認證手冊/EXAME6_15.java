import java.io.*;
class SpecialSerial implements Serializable
{
 transient int y=7;
 static int z=9;
}
public class EXAME6_15
{	
 public static void main(String argv[])
 {
 	SpecialSerial s=new SpecialSerial();
 	try
 	{
 	 ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("myFile"));
 	 oos.writeObject(s);
 	 oos.close();
 	 System.out.print(++s.z+" ");
 	 ObjectInputStream ois=new ObjectInputStream(new FileInputStream("myFile"));
 	 SpecialSerial s2=(SpecialSerial)ois.readObject();
 	 ois.close();
 	 System.out.println(s2.y+"  "+s2.z);
 	}
 	catch(Exception e)
 	{
 	 e.printStackTrace();	
 	}	 
 }	
}

