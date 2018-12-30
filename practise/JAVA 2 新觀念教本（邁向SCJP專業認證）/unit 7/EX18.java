class EX18
{
 public static void main(String argv[])
 {
  圓形 大餅=new 圓形();
  矩形 阿方=new 矩形();
  System.out.println("大餅的面積 : "+求面積(大餅));
  System.out.println("阿方的面積 : "+求面積(阿方));
 }
 
 static double 求面積(圓形 圓)
 {
  return 圓.半徑*圓.半徑*圓.圓周率;
 }
 static double 求面積(矩形 矩)
 {
  return 矩.長度*矩.寬度;
 }
 
}

class 圓形
{
 final double 圓周率=3.1515925;
 double 半徑=2;
}

class 矩形
{
 double 長度=2;
 double 寬度=1;
}