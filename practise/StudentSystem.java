import java.util.*;
import java.text.*;

public class StudentSystem{
  //static String[] subject={"中文","英文","數學","物理","化學"};
	public static void main(String[] args){
		String subject[]=new Student().getSubject();	
		Scanner keyin=new Scanner(System.in);
		System.out.print("請輸入學生人數-->");
		int count=keyin.nextInt();
    Student student[]=new Student[count];
		boolean input=false;
		int select=0;
		do{
			System.out.print("\n請選擇服務選項:\n1.輸入成績 2.列印成績 3.平均分數 4.最高分 5. 最低分 6.排序 7.離開-->");
			select=keyin.nextInt();
			switch(select){
			case 1:	
				if(input){
					System.out.println("成績已輸入完畢");
					break;	
				}
				for(int i=0;i<count;i++)
				{
				 System.out.println("=========請輸入第 "+(i+1)+" 位同學的資料=================");
				 System.out.print("請輸學號===>");
				 String id=keyin.next();
				 System.out.print("請輸姓名===>");
				 String name=keyin.next();
				 System.out.print("請輸入生日(年)===>");
				 String birthday=keyin.next();
				 System.out.print("請輸入生日(月)===>");
				 birthday+="/"+keyin.next();
				 System.out.print("請輸入生日(日)===>");
				 birthday+="/"+keyin.next();
				 System.out.print("請輸入性別===>");
				 String sex=keyin.next();
				 boolean sexB=sex.equals("男")?true:false;
				 int tempScore[]=new int[5];
				 for(int i1=0;i1<5;i1++)
				 {
				  System.out.print("請輸入"+subject[i1]+"科目的成績===>");
				  tempScore[i1]=keyin.nextInt();
				 }	
				 student[i]=new Student(id,name,new Date(birthday),sexB,tempScore);
				}					
				input=true;
				break;
			case 2: //列印成績
				if(!input){
					System.out.println("請先輸入成績成績");
					break;	
				}
								System.out.println("學號\t姓名\t生日\t\t國文\t英文\t數學\t物理\t化學");
				for(int i=0;i<count;i++)
				{
				 String bir=student[i].getBirthday().getYear()+"年"+student[i].getBirthday().getMonth()+"月"+student[i].getBirthday().getDate()+"日";
				 System.out.print(student[i].getNumber()+"\t"+student[i].getName()+"\t"+bir+"\t"+student[i].getScore(0)+"\t"+student[i].getScore(1)+"\t");
				 System.out.println(student[i].getScore(2)+"\t"+student[i].getScore(3)+"\t"+student[i].getScore(4));
				} 
				break;
			case 3: //平均分數
				if(!input){
					System.out.println("請先輸入成績成績");
					break;	
				}
			  for(int i=0;i<count;i++)
			   System.out.println(student[i].getName()+"同學的平均分數是 "+student[i].getScoreAve()+" 分");	
	
				break;
			case 4: //最高分
				if(!input){
					System.out.println("請先輸入成績成績");
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
				 System.out.println(student[i].getName()+"的最高成績是"+subject[point]+"="+max+" 分.");	
				}	
				
				break;
			case 5: //最低分
				if(!input){
					System.out.println("請先輸入成績成績");
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
				 System.out.println(student[i].getName()+"的最高成績是"+subject[point]+"="+min+" 分.");	
				}	
				
				break;
			case 6: //排序
				if(!input){
					System.out.println("請先輸入成績成績");
					break;	
				}
				int score[][][]=new int[count][2][5];
				for(int i=0;i<count;i++)
				{
				 for(int j=0;j<5;j++)
				 {
				 	score[i][0][j]=j; //寄放科目名稱的指標
				 	score[i][1][j]=student[i].getScore(j); //寄放科目的成績
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
				   	//由小排到大
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
				 System.out.println(student[i].getName()+"排序後的成績如下");
				 for(int j=0;j<5;j++)
				 {
				  System.out.println(subject[score[i][0][j]]+" 科目的成績是: "+ score[i][1][j]+" 分");
				 } 
				 System.out.println("======================================");	
				}		
			}//switch 結束
		}while(select!=7);
	}
}

class Student{
	private String number,name;
	private boolean sex;
	private Date birthday;
	private int[] score;
	private String[] subject={"中文","英文","數學","物理","化學"};
	
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

	/**sex之值為1時代表男,其他值代表女性*/
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