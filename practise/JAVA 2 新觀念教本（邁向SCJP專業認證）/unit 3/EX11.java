class EX11
{
 public static void main(String argv[])
 {
  byte n=59;
  int b1,b2,b3,b4,b5,b6,b7,b8;
  b1=(n&128)>0?1:0;
  b2=(n&64)>0?1:0;
  b3=(n&32)>0?1:0;
  b4=(n&16)>0?1:0;
  b5=(n&8)>0?1:0;
  b6=(n&4)>0?1:0;
  b7=(n&2)>0?1:0;
  b8=(n&1)>0?1:0;
  System.out.println(""+b1+b2+b3+b4+b5+b6+b7+b8);
 }
}