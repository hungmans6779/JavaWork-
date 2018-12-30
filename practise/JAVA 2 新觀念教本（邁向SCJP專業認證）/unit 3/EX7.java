class EX7
{
 public static void main(String argv[])
 {
  char t='\t';
  boolean a,b;
  System.out.println("a\tb\ta&&b\ta||b\t!a");
  a=true;
  b=true;
  System.out.println(""+a+t+b+t+(a&&b)+t+(a||b)+t+!a);
  a=true;
  b=false;
  System.out.println(""+a+t+b+t+(a&&b)+t+(a||b)+t+!a);
  a=false;
  b=true;
  System.out.println(""+a+t+b+t+(a&&b)+t+(a||b)+t+!a);
  a=false;
  b=false;
  System.out.println(""+a+t+b+t+(a&&b)+t+(a||b)+t+!a);
 }
}