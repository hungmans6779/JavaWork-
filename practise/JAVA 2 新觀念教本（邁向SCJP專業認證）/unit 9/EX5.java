public class EX5
{
 public static void main(String argv[])
 {
  IIA f=(IIA)new CCF();
  echo("f �ݩ�IIB���O: "+(f instanceof IIB));
  echo("f �ݩ�IIC���O: "+(f instanceof IIC));
  echo("f �ݩ�IID���O: "+(f instanceof IID));
  echo("f �ݩ�CCE���O: "+(f instanceof CCE));
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