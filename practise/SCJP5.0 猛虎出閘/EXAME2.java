import java.io.*;
public class EXAME2 implements Serializable
{
 public int x,y;
 public EXAME2(int x,int y)
 {
  this.x=x;
  this.y=y;
 }
 private void writeObject(ObjectOutputStream s) throws IOException
 {
  s.writeInt(x);
  s.writeInt(y);
 }
 private void readObject(ObjectInputStream s) throws IOException
 {
  x=s.readInt();
  y=s.readInt();
 }
}