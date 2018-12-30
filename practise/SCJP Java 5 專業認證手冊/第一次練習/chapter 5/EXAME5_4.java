class MyException extends Exception
{
 	
}
public class EXAME5_4
{
 public static void main(String argv[])
 {
 	try
 	{
   checkFood(argv[0]);
  }
  catch(MyException me)
  {
   System.out.println("爛東西！這種東西怎麼拿出來給顧客吃呀.............");	
  }	 
 }
 static void checkFood(String food) throws MyException
 {
 	if(food.equals("壞食物"))
 	{
 	 throw new MyException();
 	}	
 	else
 	{
 	 System.out.println("這個食物很好吃呦");	
 	}	
 }
}