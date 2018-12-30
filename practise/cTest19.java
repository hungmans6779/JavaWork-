import java.text.*;
public class cTest19
{
 public static void main(String argv[])
 {
 	NumberFormat nf=NumberFormat.getNumberInstance();
 	nf.setMaximumFractionDigits(2);
 	nf.setMaximumIntegerDigits(10);
 	System.out.println(nf.format(34343.3343423));
 	
 }		
}	
/*
void setMaximumFractionDigits(int newValue) 
          Sets the maximum number of digits allowed in the fraction portion of a number. 
 void setMaximumIntegerDigits(int newValue) 
          Sets the maximum number of digits allowed in the integer portion of a number. 
 void setMinimumFractionDigits(int newValue) 
          Sets the minimum number of digits allowed in the fraction portion of a number. 
 void setMinimumIntegerDigits(int newValue) 
          Sets the minimum number of digits allowed in the integer  
*/