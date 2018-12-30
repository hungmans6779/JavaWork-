public class EXAME4_03
{
 public static void main(String argv[])
 {
  float f1=2.3f;
  float[][]f2={{42.0f},{1.7f,2.3f},{2.6f,2.7f}};
  float[]f3={2.7f};
  Long x=42L;
  //if(f1==f2) //編譯失敗
  //if(f1==f2[2][1]) //編譯及執行成功
  //if(x==f2[0][0]) //編譯及執行成功，結果為true
  //if(f1==f2[1,1]) //編譯失敗
  if(f3==f2[2]) //編譯及執行成功
  System.out.println("true");
 }
}