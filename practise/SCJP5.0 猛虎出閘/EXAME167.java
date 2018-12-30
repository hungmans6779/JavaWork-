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
 public static void takeList(ArrayList list){} //編譯成功
 //public static void takeList(ArrayList<Animal>list){} //編譯失敗
 //public static void takeList(ArrayList<? extends Animal>list){} //編譯成功
 //public static void takeList(ArrayList<?>list){} //編譯成功
 //public static void takeList(ArrayList<Object>list){}//編譯失敗 
}