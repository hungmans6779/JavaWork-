/* 
 �D�ءG�����Ҧr���s�X�覡
 1.�@10�Ӧr
 2.�Ĥ@�Ӧr���j�g�^��r��
 3.�ĤG�Ӧr�O1��2
 4.�ĤG��Q�Ӧr���Ʀr
 5.�N�^��r���H�Ʀr�N�X���N
 6.�N11�ӼƦr���O���H�G
   1,9,8,7,6,5,4,3,2,2,�ç�n�[�`
 7.�Y�[�`��10�����ơA�Y�����T�������Ҧr���C
*/
import java.util.Random;
public class cPersionIdTest1
{
 static String id="";
 static int value=0;
 static int okCount=1;
 public static void main(String argv[])
 {
 	id=id.concat("A1");
  for(okCount=1;okCount<=10;okCount++)
  {
   gainId(); //�H�����ͨ����Ҧr��
   checkId(id,okCount);
   id="D1";
  }	
 }
 public static  String gainId()
 {
  for(int i=1;i<=8;i++)
  {
   Random rv=new Random();
   value=rv.nextInt(10);	
   id=id.concat(String.valueOf(value));	
 	}  	
 	return id;
 }	
 public static  void checkId(String id,int count)
 {
 	//�P�_�����Ҫ����׬O�_���T
 	if(id.length()!=10)
 	{
 	 System.out.println("�����Ҧr���r�ƿ��~�I�I�I");	
 	 return;
 	}	
 	//�P�_�����Ҫ��Ĥ@�Ӧr���O�_���^��r���j�g
 	char c;
 	c=id.charAt(0);
 	if(c<'A' || c>'Z')
 	{
 	 System.out.println("�����ҲĤ@�Ӧr�����OA-Z����");
 	 return;	
 	}	
 	//�P�_��2�X�O�_��1��2
 	if((!id.substring(1,2).equals("1")) && (!id.substring(1,2).equals("2")))  
 	{
 	 System.out.println("�����Ҧr������2�X����1��2");
 	 return;	
 	}
 	//�P�_��3�X��O�_���Ʀr
 	for(int i=2;i<=9;i++)
 	{
 	 c=id.charAt(i);
 	 if(c<'0' || c>'9')
 	 {
 	  System.out.println("�����Ҧr�����q��3�X�������Ʀr����");	
 	  return;
 	 }		
 	}	
 	//�N�Ĥ@�ӭ^��r���ഫ�����ԧB�Ʀr
 	char fId=id.charAt(0);
 	int buffer=fId-55;
 	String newId=String.valueOf(buffer)+id.substring(1);
 	int total=0;
 	int dd=9;
 	total=newId.charAt(0)-48;
 	for(int i=1;i<newId.length()-1;i++)
 	{
 	 total=total+=(newId.charAt(i)-48)*dd;
 	 dd--;
 	} 
 	total+=(newId.charAt(10))-48;
 	//System.out.println("total="+total);
 	if(total%10==0)
 	{
 	 System.out.println("��"+count+"�ղ��ͪ������Ҧr���O:"+id);
 	}	
 	else
 	{
 	 okCount--;	
 	}	
 }	
}