enum Week
{
 A("�P����")
 {
 	public String toString()
 	{
 	 return "��I���B�@�U�A�n���٤u�@�^��F";	
 	}	
 }	
 ,B("�P���@"),C("�P���G"),D("�P���T"),E("�P���|"),F("�P����")
 {
 	public String toString()
 	{
 	 return "�p�G�O�Ӥ몺13��A���N�O�¦�P�����F....";	
 	}	
 	
 	},G("�P����")
 	{
 	 public String toString()
 	 {
 	  return "�u�n�A���ѬO�P�����骺�Ĥ@�ѡA�i�H�n�n�C���F";
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
 	//�Ĥ@�ش���
 	Week w[]={Week.A,Week.B,Week.C,Week.D,Week.E,Week.F,Week.G};
  for(int i=0;i<w.length;i++)
  {
   switch(w[i])
   {
    case A: System.out.println("�P���@�A�U�l��o��"); break;
    case B: System.out.println("�P���@�A�U�l��s��"); break;
    case C: System.out.println("�P���G�A�U�l�{�l�j"); break;
    case D: System.out.println("�P���T�A�U�l�h���s"); break;
    case E: System.out.println("�P���|�B�U�l�h�Ҹ�"); break;
    case F: System.out.println("�P�����A�U�l�h���R"); break;
    case G: System.out.println("�P�����A�U�l�h�椻"); break;	
    default: assert false:"�U�l������...."; break;
   }	
  } 
  
  //�ĤG�ش���
  Week []w2={Week.A,Week.B,Week.C,Week.D,Week.E,Week.F,Week.G};
  for(int i=0;i<w2.length;i++)
  {
   System.out.println(w2[i]);	
  }	 	
  //�ĤT�ش���
  for(Week data:Week.values())
  {
   System.out.println(data);	
  }		
 }		
}	