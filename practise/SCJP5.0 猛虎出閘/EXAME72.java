public class EXAME72<N extends Number>
//public class EXAME72<?>
//public class EXAME72<N extends Object>
//public class EXAME72<? extends Object>
//public class EXAME72<N extends Integer>
//public class EXAME72<?  extends Number>
{
 private N min,max;
 public N getMin(){ return min;}
 public N getMax(){ return max;}
 public void add(N added)
 {
  if(min == null || added.doubleValue()<min.doubleValue())
   min=added;
  if(max == null || added.doubleValue()<max.doubleValue())
   max=added;
 }
 public static void main(String argv[])
 { }
}