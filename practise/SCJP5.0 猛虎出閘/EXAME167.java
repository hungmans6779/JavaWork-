import java.util.*;
class Animal { }
class Dog extends Animal {}

public class EXAME167
{
 public static void main(String argv[])
 {
  ArrayList<Dog> aList=new ArrayList<Dog>();
  takeList(aList);
 } 
 public static void takeList(ArrayList list){} //�sĶ���\
 //public static void takeList(ArrayList<Animal>list){} //�sĶ����
 //public static void takeList(ArrayList<? extends Animal>list){} //�sĶ���\
 //public static void takeList(ArrayList<?>list){} //�sĶ���\
 //public static void takeList(ArrayList<Object>list){}//�sĶ���� 
}