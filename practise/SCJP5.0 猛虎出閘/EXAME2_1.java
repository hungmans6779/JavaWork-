import java.io.*;
public class EXAME2_1 implements Serializable
{
 private int x,y;	
 public EXAME2_1(int x,int y)
 {
 	this.x=x;
 	this.y=y;
 }	
 private void writeObject(ObjectOutputStream s)
 {
 	try
 	{
 	 s.writeObject(x);
 	 s.writeObject(y);
 	}
 	catch(IOException ioe)
 	{} 
 }	
 private void readObject(ObjectInputStream s)
 {
 	try
 	{
 	 x=s.readInt();
 	 y=s.readInt();
 	}
 	catch(IOException ioe)
 	{} 
 }	
 public static void main(String argv[])
 {
 	EXAME2_1 exame2_1=new EXAME2_1(3,2);
 	try
 	{
 	 FileOutputStream fos=new FileOutputStream("exame2_1.ser");
 	 ObjectOutputStream oos=new ObjectOutputStream(fos);	
 	 oos.writeObject(oos);	
 	 oos.close();
 	 fos.close();
 	}	
 	catch(IOException ioe)
 	{ }	
 	try
 	{
 	 FileInputStream fin=new FileInputStream("exame2_1.ser");
 	 ObjectInputStream ois=new ObjectInputStream(fin);
 	 ois.close();
 	 fin.close();
 	}	
 	catch(Exception ioe1)
 	{ }
 		
 		
 	
 }	
 
}