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
import java.util.*;
public class cPersionId
{
 static String id="";
 static int value=0;
 static int okCount=1;
 static boolean showAuto=true;
 static Random rv=new Random();
 public static void main(String argv[])
 {
 	System.out.println("****************************************************");	
 	System.out.println("�{���W�١G�����Ҳ��ͤ����Ҩt��");
 	System.out.println("�@    �̡G�x�ŧ�(HUNG CHIA HUNG)");
 	System.out.println("�W�Ҿɮv�G�\�j��");
 	System.out.println("�}�o����G2007�~6��21��");
 	System.out.println("���v�Ҧ��A�Фū���");
  System.out.println("****************************************************");	
 	System.out.println("\n�п�ܱz�n���\��ﶵ");
 	System.out.println("1.������J�@�ը����Ҧr���i������");
 	System.out.println("2.�۰ʲ��ͨ����Ҧr��");
 	Scanner scan=new Scanner(System.in);
 	System.out.print("�п�J�z���ﶵ===>");
 	int select=scan.nextInt();
 	System.out.println("===========================================");
 	switch(select)
 	{
 	 //��J�����Ҧr���i������	
 	 case 1: 
 	     System.out.print("�п�J�z�������Ҧr��:");
 	     String id=scan.next();
 	     showAuto=false;
 	     checkId(id,1); //�ˬd�����Ҧr���O�_���T
 	  break;
 	 //�۰ʲ��ͨ����Ҧr��
 	 case 2:
 	  System.out.print("�п�J�z�n���ͪ������Ҧr���ռ�===>");
 	  int grNum=scan.nextInt();
 	  showAuto=true;
    for(okCount=1;okCount<=grNum;okCount++)
    { 
     id=gainId(); //�H�����ͨ����Ҧr��
     checkId(id,okCount); //�ˬd�����Ҧr���O�_���T
    }	 	 
 	  break;
 	 default:
 	    break;	
 	}	
 }
 public static String gainId()
 {
 	id="";
 	//���ͲĤ@�Ӥj�g���^��r��
  int addValue=rv.nextInt(25)+65;
  Character c1=new Character((char)addValue);
  id=id.concat(c1.toString());
  //���ͲĤG�ӼƦr��1��2
  addValue=rv.nextInt(1)+1;
  Integer i1=new Integer(addValue);
  id=id.concat(i1.toString());
  //���ͳѾl��3-10�X���Ʀr
  for(int i=1;i<=8;i++)
  {
   value=rv.nextInt(10);	
   id=id.concat(String.valueOf(value));	
 	}  	
 	return id;
 }	
 public static  void checkId(String id,int count)
 {
 	//�P�_�����Ҫ��r���榡�O�_���T 
 	if(!id.matches("[A-Z][12]\\d\\d\\d\\d\\d\\d\\d\\d"))
 	{
 	 System.out.println("�z��J�������Ҧr���榡���~�I�I�I");	
 	 return;	
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
 	 if(showAuto)	
 	  System.out.println("��"+count+"�ղ��ͪ������Ҧr���O:"+id);
 	 else
 	  System.out.println("\n�z��J�������Ҧr��"+id+"�O���T��");
 	}	
 	else
 	{
 	 if(showAuto)	
 	  okCount--;	
   else
 	  System.out.println("\n�z��J�������Ҧr��"+id+"�O���~���I�I�I");
 	}	
 }	
}