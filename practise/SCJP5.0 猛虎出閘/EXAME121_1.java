class Line
{
 public static class Print
 {
 	public void draw()
 	{
 	 System.out.println("我被執行了");	
 	}	
 }
}
public class EXAME121_1
{
	public static void main(String argv[])
	{
   Line.Print p=new Line.Print();
   p.draw();
  } 
}