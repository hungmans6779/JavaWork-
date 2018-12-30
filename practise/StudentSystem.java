import java.util.*;
import java.text.*;

public class StudentSystem{
  //static String[] subject={"����","�^��","�ƾ�","���z","�ƾ�"};
	public static void main(String[] args){
		String subject[]=new Student().getSubject();	
		Scanner keyin=new Scanner(System.in);
		System.out.print("�п�J�ǥͤH��-->");
		int count=keyin.nextInt();
    Student student[]=new Student[count];
		boolean input=false;
		int select=0;
		do{
			System.out.print("\n�п�ܪA�ȿﶵ:\n1.��J���Z 2.�C�L���Z 3.�������� 4.�̰��� 5. �̧C�� 6.�Ƨ� 7.���}-->");
			select=keyin.nextInt();
			switch(select){
			case 1:	
				if(input){
					System.out.println("���Z�w��J����");
					break;	
				}
				for(int i=0;i<count;i++)
				{
				 System.out.println("=========�п�J�� "+(i+1)+" ��P�Ǫ����=================");
				 System.out.print("�п�Ǹ�===>");
				 String id=keyin.next();
				 System.out.print("�п�m�W===>");
				 String name=keyin.next();
				 System.out.print("�п�J�ͤ�(�~)===>");
				 String birthday=keyin.next();
				 System.out.print("�п�J�ͤ�(��)===>");
				 birthday+="/"+keyin.next();
				 System.out.print("�п�J�ͤ�(��)===>");
				 birthday+="/"+keyin.next();
				 System.out.print("�п�J�ʧO===>");
				 String sex=keyin.next();
				 boolean sexB=sex.equals("�k")?true:false;
				 int tempScore[]=new int[5];
				 for(int i1=0;i1<5;i1++)
				 {
				  System.out.print("�п�J"+subject[i1]+"��ت����Z===>");
				  tempScore[i1]=keyin.nextInt();
				 }	
				 student[i]=new Student(id,name,new Date(birthday),sexB,tempScore);
				}					
				input=true;
				break;
			case 2: //�C�L���Z
				if(!input){
					System.out.println("�Х���J���Z���Z");
					break;	
				}
								System.out.println("�Ǹ�\t�m�W\t�ͤ�\t\t���\t�^��\t�ƾ�\t���z\t�ƾ�");
				for(int i=0;i<count;i++)
				{
				 String bir=student[i].getBirthday().getYear()+"�~"+student[i].getBirthday().getMonth()+"��"+student[i].getBirthday().getDate()+"��";
				 System.out.print(student[i].getNumber()+"\t"+student[i].getName()+"\t"+bir+"\t"+student[i].getScore(0)+"\t"+student[i].getScore(1)+"\t");
				 System.out.println(student[i].getScore(2)+"\t"+student[i].getScore(3)+"\t"+student[i].getScore(4));
				} 
				break;
			case 3: //��������
				if(!input){
					System.out.println("�Х���J���Z���Z");
					break;	
				}
			  for(int i=0;i<count;i++)
			   System.out.println(student[i].getName()+"�P�Ǫ��������ƬO "+student[i].getScoreAve()+" ��");	
	
				break;
			case 4: //�̰���
				if(!input){
					System.out.println("�Х���J���Z���Z");
					break;	
				}
				for(int i=0;i<count;i++)
				{
				 int max=student[i].getScore(0);
				 int point=0;
				 for(int j=1;j<5;j++)
				 {
				 	if(max<student[i].getScore(j))
				 	{
				 	 max=student[i].getScore(j);
				 	 point=j;
				 	}	
				 }
				 System.out.println(student[i].getName()+"���̰����Z�O"+subject[point]+"="+max+" ��.");	
				}	
				
				break;
			case 5: //�̧C��
				if(!input){
					System.out.println("�Х���J���Z���Z");
					break;	
				}
				for(int i=0;i<count;i++)
				{
				 int min=student[i].getScore(0);
				 int point=0;
				 for(int j=1;j<5;j++)
				 {
				 	if(min>student[i].getScore(j))
				 	{
				 	 min=student[i].getScore(j);
				 	 point=j;
				 	}	
				 }
				 System.out.println(student[i].getName()+"���̰����Z�O"+subject[point]+"="+min+" ��.");	
				}	
				
				break;
			case 6: //�Ƨ�
				if(!input){
					System.out.println("�Х���J���Z���Z");
					break;	
				}
				int score[][][]=new int[count][2][5];
				for(int i=0;i<count;i++)
				{
				 for(int j=0;j<5;j++)
				 {
				 	score[i][0][j]=j; //�H���ئW�٪�����
				 	score[i][1][j]=student[i].getScore(j); //�H���ت����Z
				 }	
        }	
				 for(int i=0;i<count;i++)
				 {
				 	int temp1=0;
				 	int temp2=0;
				  for(int j=0;j<4;j++)
				  {
				   for(int k=j+1;k<5;k++)
				   {
				   	//�Ѥp�ƨ�j
				    if(score[i][1][j]>score[i][1][k])
				    {
				     temp1=score[i][1][j];
				     score[i][1][j]=score[i][1][k];
				     score[i][1][k]=temp1;
				     temp2=score[i][0][j];
				     score[i][0][j]=score[i][0][k];
				     score[i][0][k]=temp2; 
				    }	
				   } 
				  }		
				 }	
				for(int i=0;i<count;i++)
				{
				 System.out.println(student[i].getName()+"�Ƨǫ᪺���Z�p�U");
				 for(int j=0;j<5;j++)
				 {
				  System.out.println(subject[score[i][0][j]]+" ��ت����Z�O: "+ score[i][1][j]+" ��");
				 } 
				 System.out.println("======================================");	
				}		
			}//switch ����
		}while(select!=7);
	}
}

class Student{
	private String number,name;
	private boolean sex;
	private Date birthday;
	private int[] score;
	private String[] subject={"����","�^��","�ƾ�","���z","�ƾ�"};
	
	public String[] getSubject()
	{
	 return subject;	
	}	

	public boolean setScore(int[] score){
		if(score.length!=5)
			return false;
		for(int x=0;x<score.length;x++){
			if(score[x]<0 || score[x]>100)
				return false;
		}
		this.score=score;
		return true;
	}
	public boolean setScore(int subject,int score){
		if(subject<0 || subject>4)
			return false;
		if(score<0 || score>100)
			return false;
		this.score[subject]=score;
		return true;
	}
	public int getScore(int subject){
		if(subject<0 || subject>4)
			return 0;
		return score[subject];
	}
	public float getScoreAve(){
		float total=0;
		for(int x:score)
			total+=x;
		NumberFormat nf=NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(2);
		return Float.valueOf(nf.format(total/5));
	}
	
	
	
	public boolean setNumber(String number){
		if(number.startsWith("A") && number.length()==5){
			this.number=number;
			return true;
		}
		return false;
	}
	public String getNumber(){
		return number;
	}
	
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public int getAge(){
		return new Date().getYear()-birthday.getYear();
	}

	/**sex���Ȭ�1�ɥN��k,��L�ȥN��k��*/
	public void setSex(int sex){
		this.sex=(sex==1?true:false);
	}
	public void setSex(boolean sex){
		this.sex=sex;
	}

	public int getSex(){
		return sex?1:0;
	}
	
	public boolean setBirthday(Date birthday){
		int thisYear=new Date().getYear();	
		if(birthday.getYear()>=(thisYear-50) && birthday.getYear()<=(thisYear-15)){
			this.birthday=birthday;
			return true;
		}
		return false;
	}
	public Date getBirthday(){
		Date d=new Date(birthday.getTime());
		return d;
	}
	
	public Student(){
		number="A0000";
		name="Guest";
		sex=true;
		birthday=new Date("2000/1/1");
		score=new int[5];
	}
	public Student(String number,String name,Date birthday,boolean sex,int[] score){
		this();
		setNumber(number);
		setName(name);
		setBirthday(birthday);
		setSex(sex);
		setScore(score);
	}
}