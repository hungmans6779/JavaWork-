public class EX16
{
 public static void main(String argv[])
 {
  Ani a[]=new Ani[3];
  a[0]=new Ani();
  a[1]=new Ver();
  a[2]=new Fis();
  for(int i=0;i<3;i++)
  {
   if(a[i] instanceof Ver)
   {
    System.out.println("a["+i+"] = "+((Ver)a[i]).getF());
    //System.out.pirnltn("a["+i+"] = "+a[i].getF());
   }
  }  
 }
}

class Ani{}

class Ver extends Ani
{
 private String f="¯á´Õ°Êª«";
 String getF()
 {
  return f;
 }
}

class Fis extends Ver{}