import java.io.*;
public class EXAME1_1 implements Serializable
{
 private Tree tree=new Tree();
 public static void main(String argv[])
 {
 	EXAME1_1 exame1=new EXAME1_1();
 	try
 	{
   FileOutputStream fout=new FileOutputStream("Forest.ser");
   ObjectOutputStream oos=new ObjectOutputStream(fout);
   oos.writeObject(exame1);
   oos.close();
   fout.close();
  }
  catch(IOException ioe)
  {} 
 }
}

class Tree{}