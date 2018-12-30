public class EX3
{
 public static void main(String argv[])
 {
  try
  {
   int i=Integer.parseInt(argv[0]);
   int j=Integer.parseInt(argv[1]);
   int k=i%j;
   System.out.println(i+"%"+j+" = "+k);
  }
  catch(ArithmeticException ae)
  {
   System.out.println("除數不可為0");
  }
  catch(ArrayIndexOutOfBoundsException aie)
  {
   System.out.println("請加上兩個整數參數以做求餘數的運算");	
  }	
  catch(NumberFormatException ne)
  {
   System.out.println("請加上兩個【整數】參數");	
  }	
  catch(RuntimeException re)
  {
   System.out.println("發生執行時期例外 : "+re);	
  }	
 }
}