public class EX23
{
 public static void main(String argv[])
 {
  �Ȧ�b�� ���Q=new �Ȧ�b��("8888",100);
  ���Q.�s��(2000);
  ���Q.����("6666",10000);
  ���Q.����("8888",10000);
  ���Q.�d��("8888");
  ���Q.����("8888",1000);
  //System.out.println(���Q.���B);
 }
}

class �Ȧ�b��
{
 private String �K�X;
 private int ���B;
 public �Ȧ�b��(String �K�X,int �s�J��)
 {
  this.�K�X=�K�X;
  ���B=�s�J��;
  System.out.print("���H�}�ᦨ�\�I ");
  �d��();
 }
 
 public void �s��(int �s�J��)
 {
 	���B+=�s�J��;
 	System.out.print("�����s�J�I ");
 	�d��();
 }
 	
 public void ����(String �K�X,int ���ڪ�)
 {
  if(this.�K�X.equals(�K�X))
  {
   if(���B>=���ڪ�)
   {
   	���B-=���ڪ�;
   	System.out.print("�������X:"+���ڪ�);
   	�d��();
   }		
   else
   {
   	System.out.println("�Ѿl���B�������X : "+���ڪ�);
   }	
  }
  else
  {
   System.out.println("�K�X���~�I�����������");	
  }			
 }	
 
 public void �d��(String �K�X)
 {
 	if(this.�K�X.equals(�K�X))
 	{
 	 �d��();	
 	}	
 	else
 	{
 	 System.out.println("�K�X���~�I ");	
 	}	
 }	
 
 private void �d��()
 {
  System.out.println("�ثe�����B�� : "+���B);
 }

}