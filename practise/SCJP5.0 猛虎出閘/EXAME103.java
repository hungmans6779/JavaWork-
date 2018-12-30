import java.util.*;
public class EXAME103
{
 public static void main(String argv[])
 {
 	/* 第二行編譯失敗
  ArrayList<String>x1=new ArrayList<String>();
  foo(x1);
  */
  /* 第一行編譯失敗
  ArrayList<Object>x2=new ArrayList<String>();
  foo(x2); 
  */
  
  //編譯成功
  ArrayList<Object>x3=new ArrayList<Object>();
  foo(x3);
  
  //編譯成功
  ArrayList x4=new ArrayList();
  foo(x4); 
 }
 public static void foo(List<Object>list)
 {
 	
 }	
}