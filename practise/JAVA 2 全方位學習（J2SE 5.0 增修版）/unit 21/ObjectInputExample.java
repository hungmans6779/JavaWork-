import java.io.*;
public class ObjectInputExample
{
 public static void main(String argv[])
 {
 	try 
 	{                                                                       
 	 FileInputStream fin = new FileInputStream("StudentScoreObject.txt");      
  	 ObjectInputStream objIn = new ObjectInputStream(fin);                     
  	 Student st = (Student)objIn.readObject();                                 
	 st.printData();                                                           
	 objIn.close();                                                            
	 fin.close();                                                              
 	}                                                                           
 	catch (Exception e)                                                         
  {                                                                           
   System.err.println(e);                                                    
  }                                                                           
 } 
}
