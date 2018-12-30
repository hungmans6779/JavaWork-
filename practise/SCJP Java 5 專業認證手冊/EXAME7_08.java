import java.util.*;
public class EXAME7_08
{
 private Map accountTotals=new HashMap();
 private int retirementFund;
 public int getBalance(String accountName)
 {
  Integer total=(Integer)accountTotals.get(accountName);
  if(total==null)
  {
   total=Integer.valueOf(0);	
  }	
  return total.intValue();	
 }	
 public void setBlance(String accountName,int amount)
 {
  accountTotals.put(accountName,Integer.valueOf(amount));	
 }	
 public static void main(String argv[])
 { }
}