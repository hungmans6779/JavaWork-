public class EX9
{
 public static void main(String argv[])
 {
  巫師 小黑=new 巫師();
  巫師 小白=new 巫師();
  巫師 有點黑;
  小黑.魔法攻擊(小白);
  小白.魔法攻擊(小黑);
  小白.魔法攻擊(小黑);
  有點黑=小黑.分身術();
  System.out.println("小白 : "+小白.getAtt());
  System.out.println("小黑 : "+小黑.getAtt());
  System.out.println("有點黑 : "+有點黑.getAtt());
 }
}

class 巫師
{
 int 生命值=60;	
 int 魔法力=100;	
 
 void 魔法攻擊(巫師 笨巫師)
 {
 	魔法力-=5;
 	笨巫師.生命值-=5;
 }		
	
 巫師 分身術()
 {
 	魔法力-=10;
 	return new 巫師();
 }	

 String getAtt()
 {
 	return "生命值=>"+生命值+"，魔法力=>"+魔法力;	
 }	
}