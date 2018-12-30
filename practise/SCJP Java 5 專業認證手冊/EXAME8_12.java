public abstract class EXAME8_12
{
 public int getNum()
 {
  return 45;
 }
 public abstract class Bar
 {
  public int getNum()
  {
   return 38;
  }
 }
 public static void main(String argv[])
 {
 	EXAME8_12 t=new EXAME8_12()
 	{
 	 public int getNum()
 	 {
 	 	return 22;
 	 }		
 	};
 	EXAME8_12.Bar f=t.new Bar()
 	{
   public int getNum()
   {
    return 57;	
   }			
 	};		
 	System.out.println(f.getNum()+" "+t.getNum());
 }	
}