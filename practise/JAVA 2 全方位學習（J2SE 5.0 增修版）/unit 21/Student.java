import java.io.*;
public class Student implements Serializable 
{
 private String name;
 private int chScore,engScore,mathScore;
 public Student(String name,int chScore,int engScore,int mathScore)
 {
 	this.name=name;
 	this.chScore=chScore;
 	this.engScore=engScore;
 	this.mathScore=mathScore;
 }		
 public double avgScore()
 {
 	return (chScore+engScore+mathScore)/3.0;
 }	
 public void printData()
 {
 	System.out.println("學生姓名 ： "+name);
 	System.out.println("國文成績 ： "+chScore);
 	System.out.println("英文成績 ： "+engScore);
 	System.out.println("數學成績 ： "+mathScore);
 	System.out.println("平均成績 ： "+avgScore());
 }	
}	