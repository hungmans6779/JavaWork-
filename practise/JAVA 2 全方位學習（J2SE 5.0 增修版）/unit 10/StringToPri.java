class StringToPri
{
 public static void main(String argv[])
 {
 try
  {
   boolean Boll=Boolean.valueOF("false").booleanValue();
   System.out.println("Boll="+Boll);
   Boll=Boolean.valueOf("True").booleanValue();
   System.out.println("Boll="+Boll);
   String Str1="126";
   byte B1=Byte.parseByte("20");
   System.out.println("B1="+B1);
   short S1=Shost.parseShort(Str1);
   System.out.println("S1="+S1);
   int I1=Integer.parseInt(Str1);
   System.out.println("I1="+I1);
   long L1=Long.parseLong(Str1);
   System.out.println("L1="+L1);
   float F1=Float.parseFloat(Str1);
   System.out.println("F1="+F1);
   double D1=Double.parseDouble(Str1);
   System.out.println("D1="+D1);
   S1=Short .parseShort("332.81");
   System.out.println("S1="+S1);   
  }
  catch(NumberFormatException obj)
  {
   System.out.println("NumberFormatException happens");
  }
 }

}
