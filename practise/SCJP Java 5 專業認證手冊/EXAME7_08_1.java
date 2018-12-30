import java.util.*;
public class EXAME7_08_1
{
 private Map<String,Integer> accountTotals=new HashMap<String,Integer>();
 private int retirementFund;
 public int getBalance(String accountName)
 {
  Integer total=(Integer)accountTotals.get(accountName);
  if(total==null)
  {
   total=0;	
  }	
  return total;	
 }	
 public void setBlance(String accountName,int amount)
 {
  accountTotals.put(accountName,amount);	
 }	
 public static void main(String argv[])
 { }
}