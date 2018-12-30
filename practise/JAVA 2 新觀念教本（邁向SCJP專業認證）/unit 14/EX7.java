import java.io.*;
public class EX7
{
 public static void main(String argv[]) throws IOException
 {
  FileOutputStream fos=new FileOutputStream("datainputstream.btz");
  DataOutputStream dos=new DataOutputStream(fos);
  dos.writeInt(511);
  dos.writeFloat(0.5f);
  dos.writeBoolean(true);
  dos.flush();
  dos.close();
  fos.close();
 }
}