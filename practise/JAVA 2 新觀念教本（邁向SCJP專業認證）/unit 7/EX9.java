public class EX9
{
 public static void main(String argv[])
 {
  �Ův �p��=new �Ův();
  �Ův �p��=new �Ův();
  �Ův ���I��;
  �p��.�]�k����(�p��);
  �p��.�]�k����(�p��);
  �p��.�]�k����(�p��);
  ���I��=�p��.�����N();
  System.out.println("�p�� : "+�p��.getAtt());
  System.out.println("�p�� : "+�p��.getAtt());
  System.out.println("���I�� : "+���I��.getAtt());
 }
}

class �Ův
{
 int �ͩR��=60;	
 int �]�k�O=100;	
 
 void �]�k����(�Ův �§Ův)
 {
 	�]�k�O-=5;
 	�§Ův.�ͩR��-=5;
 }		
	
 �Ův �����N()
 {
 	�]�k�O-=10;
 	return new �Ův();
 }	

 String getAtt()
 {
 	return "�ͩR��=>"+�ͩR��+"�A�]�k�O=>"+�]�k�O;	
 }	
}