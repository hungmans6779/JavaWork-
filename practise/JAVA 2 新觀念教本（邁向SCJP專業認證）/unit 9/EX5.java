public class EX5
{
 public static void main(String argv[])
 {
  IIA f=(IIA)new CCF();
  echo("f 콜⒀IIBガ쬜: "+(f instanceof IIB));
  echo("f 콜⒀IICガ쬜: "+(f instanceof IIC));
  echo("f 콜⒀IIDガ쬜: "+(f instanceof IID));
  echo("f 콜⒀CCEガ쬜: "+(f instanceof CCE));
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