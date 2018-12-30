import java.util.Arrays;
public class ToStringv1
{
 public static void main(String argv[])
 {
  int a[]={1,2,3,4,5};
  System.out.println("a[]皚 = "+Arrays.toString(a));
  
  String str[]={"abc","def","ghi"};
  System.out.println("str[]皚 = "+Arrays.toString(str));
  
  Object obj[]={a,str,new java.util.Date()};
  System.out.println("obj[]皚 = "+Arrays.deepToString(obj));
  
  int aq[]={1,2,3};
  int bq[]={1,2,3};
  int cq[]={4,5,6}; 
  System.out.println("aq[]皚ず甧 = "+Arrays.toString(aq));
  System.out.println("bq[]皚ず甧 = "+Arrays.toString(bq));
  System.out.println("cq[]皚ず甧 = "+Arrays.toString(cq));
  System.out.println("ゑ耕aq[]のbq[]皚ず甧琌单 = "+Arrays.equals(aq,bq));
  System.out.println("ゑ耕aq[]のcq[]皚ず甧琌单 = "+Arrays.equals(aq,cq));
  System.out.println("ゑ耕bq[]のcq[]皚ず甧琌单 = "+Arrays.equals(bq,cq));
  
  Object ob1[]={aq,bq};
  Object ob2[]={aq,cq};
  Object ob3[]={bq,cq};
  System.out.println("ob1[]皚ず甧 = "+Arrays.deepToString(ob1));
  System.out.println("ob2[]皚ず甧 = "+Arrays.deepToString(ob2));
  System.out.println("ob3[]皚ず甧 = "+Arrays.deepToString(ob3));
  System.out.println("ob1[]籔oj2[]琌单 = "+Arrays.deepEquals(ob1,ob2));
  System.out.println("ob1[]籔oj3[]琌单 = "+Arrays.deepEquals(ob1,ob3));
  System.out.println("ob2[]籔oj3[]琌单 = "+Arrays.deepEquals(ob2,ob3));
 }
}