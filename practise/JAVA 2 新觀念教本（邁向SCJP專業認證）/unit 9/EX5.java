public class EX5
{
 public static void main(String argv[])
 {
  IIA f=(IIA)new CCF();
  echo("f 屬於IIB型別: "+(f instanceof IIB));
  echo("f 屬於IIC型別: "+(f instanceof IIC));
  echo("f 屬於IID型別: "+(f instanceof IID));
  echo("f 屬於CCE型別: "+(f instanceof CCE));
 }
 public static void echo(String s)
 {
  System.out.println(s);
 }
}

interface IIA{}
interface IIB{}
interface IIC extends IIA,IIB{}
interface IID{}
class CCE{}
class CCF extends CCE implements IIC,IID{}