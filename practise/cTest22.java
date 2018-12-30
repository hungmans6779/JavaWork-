import java.util.*;
public class cTest22
{
 public static void main(String argv[])
 {
  
 }
}

class Student
{
 private String name;
 private String sex;
 private int  phone;
 private String address; 
 private Date birthday;
 private int [] score=new int[5]; //國文、英文、數學、物理、化學
 
 
 public boolean setScore(int [] grade)
 {
 	if(grade.length!=5)
 	 return false;
 	
 	for(int i=0;i<grade.length;i++)
 	{
 	 if(grade[i]<0 || grade[i]>100)
 	  return false;	
 	}	
 	score=grade;
 	return true;
 }	
 
 public void setScore(String cla,int grade)
 {
 	if(grade<0 || grade>100)
 	{
 	 System.out.println("您輸入的成績錯誤！！！");
 	 return;	
 	}	
  if(cla.equals("國文"))
   score[0]=grade;
  else if(cla.equals("英文"))
   score[1]=grade;
  else if(cla.equals("數學"))
   score[2]=grade;
  else if(cla.equals("物理"))
   score[3]=grade;
  else if(cla.equals("化學"))
   score[4]=grade;
  else
   System.out.print("您輸入的課目名稱錯誤！！！");
 }	
 
 public int[] getScore()
 {
  return score;
 }
 
 public void updateScore(String cla,int grade)
 {
 	if(grade<0 || grade>100)
 	{
 	 System.out.println("您輸入的成績錯誤！！！");
 	 return;	
 	}	
  if(cla.equals("國文"))
   score[0]=grade;
  else if(cla.equals("英文"))
   score[1]=grade;
  else if(cla.equals("數學"))
   score[2]=grade;
  else if(cla.equals("物理"))
   score[3]=grade;
  else if(cla.equals("化學"))
   score[4]=grade;
  else
   System.out.print("您輸入的課目名稱錯誤！！！");
 }	
 
 public void setName(String name)
 { this.name=name; }	
 public String getName()
 { return name; }
 
 public void setSex(String sex)
 { this.sex=sex; }	
 public String getSex()
 { return sex; }
 
 
 public boolean setBirthday(Date date)
 {
 	int thisYear=new Date().getYear();
 	int diffYear=thisYear-date.getYear();
 	if(diffYear>=15 && diffYear<=100)
 	{
 	 birthday=date;
 	 return true;	
 	}	
 	else
 	{
 	 birthday=null;
 	 return false;	
 	}	
 }
 
 
 
 public int getAge()
 {
  return new Date().getYear()-birthday.getYear();
 }
 
 		
 public void setPhone(int phone)
 { this.phone=phone; }	
 public int getPhone()
 { return phone; }
 
 public void setAddress(String address)
 { this.address=address; }	
 public String getAddress()
 { return address; }
}
