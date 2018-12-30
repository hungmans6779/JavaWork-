import java.util.*;
import java.text.*;
public class Student{
	public final static int MAX_AGE=50;
	public final static int MIN_AGE=15;
	private static int count;
	private String number,name;
	private boolean sex;
	private Date birthday;
	private int[] score;
	private String[] subject={"中文","英文","數學","物理","化學"};

  public String toString()
  {
   return getNumber()+","+getName();	
  }	
  
  public boolean equals(Object o)
  {
   //第一種寫法	
   boolean b=false;
   String s=((Student)o).getNumber();
   if(number.equals(s))
    b=true;	
   else
    b=false;
    return b;
    
    //第二種寫法
    //return number.equals(((Student)o).getNumber());
    
    //第三種寫法
    /*
    if(o instanceof Student && ((Student)o).getNumber().equals(number))
     return true;
    else
     return false;
    */ 
  }	
  public int hashCode()
  {
   return number.hashCode()^number.hashCode();	
  }	

	public static boolean canBeStudent(Date d){
		if(d==null)
			return false;
		int thisYear=new Date().getYear();	
		if(d.getYear()>=(thisYear-MAX_AGE) && d.getYear()<=(thisYear-MIN_AGE)){
			return true;
		}
		return false;
	}
	public static int getCount(){
		return count;
	}
	public String[] getSubject(){
		return subject;
	}
	public boolean setScore(int[] score){
		if(score.length!=5)
			return false;
		for(int x=0;x<score.length;x++){
			if(score[x]<0 || score[x]>100){
				return false;
			}
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
	public float getScoreAve(){
		float total=0;
		for(int x:score)
			total+=x;
		NumberFormat nf=NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		return Float.parseFloat(nf.format(total/5));
	}
	public int getScore(int subject){
		if(subject<0 || subject>4)
			return 0;
		return score[subject];
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
		//new
		if(birthday==null)
			return false;
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
	public void finalize(){
		count--;
	}
	public Student(){
		count++;
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
	//new
	public Student(String number,String name,Date birthday,int sex,int[] score){
		this();	
		setNumber(number);
		setName(name);
		setBirthday(birthday);
		setSex(sex);
		setScore(score);
	}
	public static void main(String[] args){
		System.out.println(Student.getCount());
		Scanner keyin=new Scanner(System.in);
		Student s2=new Student();
		Student s=new Student("A1001","Yung",new Date("1988/1/1"),true,new int[]{81,1,54,68,97,24});
		s.setScore(new int[]{1,2,3,4000,5000});
		System.out.println(s.getCount());
		System.out.println(s.getNumber());
		System.out.println(s.getAge());
		System.out.println(s.getBirthday());
		System.out.println(s.getScoreAve());
		s=null;
		System.gc();
		for(int a=1;a<=10000;a++);
		System.out.println(Student.getCount());
		System.out.println(Student.canBeStudent(new Date()));
		
	}
}