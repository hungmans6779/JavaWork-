public class EXAME38
{
 private String desc;
 public String getDesc()
 {
  return desc;
 }
 public void setDesc(String str)
 {
  desc=str;
 }
 
 public static void modifyDesc(EXAME38 exame,String str)
 {
  exame=new EXAME38();
  exame.setDesc("str");
 }
 public static void main(String argv[])
 {
  EXAME38 e1=new EXAME38();
  e1.setDesc("Java");
  EXAME38 e2=new EXAME38();
  e2.setDesc("World");
  modifyDesc(e1,"Linux");
  System.out.println(e1.getDesc());
  System.out.println(e2.getDesc()); 
 }
}