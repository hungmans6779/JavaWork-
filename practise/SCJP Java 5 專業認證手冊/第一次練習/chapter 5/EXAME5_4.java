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
   System.out.println("��F��I�o�تF���򮳥X�ӵ��U�ȦY�r.............");	
  }	 
 }
 static void checkFood(String food) throws MyException
 {
 	if(food.equals("�a����"))
 	{
 	 throw new MyException();
 	}	
 	else
 	{
 	 System.out.println("�o�ӭ����ܦn�Y��");	
 	}	
 }
}