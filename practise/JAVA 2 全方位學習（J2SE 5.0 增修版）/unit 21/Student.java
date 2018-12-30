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
 	System.out.println("�ǥͩm�W �G "+name);
 	System.out.println("��妨�Z �G "+chScore);
 	System.out.println("�^�妨�Z �G "+engScore);
 	System.out.println("�ƾǦ��Z �G "+mathScore);
 	System.out.println("�������Z �G "+avgScore());
 }	
}	