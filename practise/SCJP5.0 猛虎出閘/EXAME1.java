import java.io.*;
public class EXAME1 implements Serializable
{
 private Tree tree=new Tree();
 public static void main(String argv[])
 {
 	EXAME1 exame1=new EXAME1();
 	try
 	{
   FileOutputStream fout=new FileOutputStream("Forest.ser");
   ObjectOutputStream oos=new FileOutputStream(fout);
   oos.writeObject(exame1);
   oos.close();
   fout.close();
  }
  catch(IOException ioe)
  {} 
 }
}

class Tree{}