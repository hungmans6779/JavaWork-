enum Week
{
 A("星期日")
 {
 	public String toString()
 	{
 	 return "嗯！收拾一下，要返還工作崗位了";	
 	}	
 }	
 ,B("星期一"),C("星期二"),D("星期三"),E("星期四"),F("星期五")
 {
 	public String toString()
 	{
 	 return "如果是該月的13日，那就是黑色星期五了....";	
 	}	
 	
 	},G("星期六")
 	{
 	 public String toString()
 	 {
 	  return "真好，今天是周末假日的第一天，可以好好遊玩了";
 	 }		
 		
 	}	
 	;
 private String value;
 private Week(String value)
 {
 	this.value=value;
 }	
 public String toString()
 {
 	return value;
 }	
}	

public class cTest64
{
 public static void main(String argv[])
 {
 	//第一種測試
 	Week w[]={Week.A,Week.B,Week.C,Week.D,Week.E,Week.F,Week.G};
  for(int i=0;i<w.length;i++)
  {
   switch(w[i])
   {
    case A: System.out.println("星期一，猴子刷油漆"); break;
    case B: System.out.println("星期一，猴子穿新衣"); break;
    case C: System.out.println("星期二，猴子肚子餓"); break;
    case D: System.out.println("星期三，猴子去爬山"); break;
    case E: System.out.println("星期四、猴子去考試"); break;
    case F: System.out.println("星期五，猴子去跳舞"); break;
    case G: System.out.println("星期六，猴子去斗六"); break;	
    default: assert false:"猴子死蹺蹺...."; break;
   }	
  } 
  
  //第二種測試
  Week []w2={Week.A,Week.B,Week.C,Week.D,Week.E,Week.F,Week.G};
  for(int i=0;i<w2.length;i++)
  {
   System.out.println(w2[i]);	
  }	 	
  //第三種測試
  for(Week data:Week.values())
  {
   System.out.println(data);	
  }		
 }		
}	