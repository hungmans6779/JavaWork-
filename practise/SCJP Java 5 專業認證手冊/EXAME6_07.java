import java.io.File;
public class EXAME6_07
{
 public static void main(String argv[])
 {
  try
  {
   File dir=new File("dir3");
   dir.mkdir();
   File file=new File("dir3","file3.txt");
   file.createNewFile();
   
  }
  catch(Exception x)
  { }
 }
}