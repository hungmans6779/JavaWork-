import java.io.*;
import java.util.*;
public class cFileTest1
{
 public static void main(String argv[]) throws IOException
 {
  File file=new File("D:\\【行政程式設計班學員的極重要資料】（勿砍）\\JavaTest\\Test.txt"); 
  if(file.exists())
   System.out.println("該檔案已存在");
  else
  	System.out.println(file.createNewFile()?"該檔案建立成功":"該檔案建立失敗");	
  System.out.println(file.canRead()?"檔案可以讀取":"檔案不可以讀取");
  System.out.println(file.canWrite()?"檔案可以寫入":"檔案不可以寫入");
  System.out.println("該檔案的絕對路徑:"+file.getAbsolutePath());
  //System.out.println("該檔案的絕對路徑:"+file.getCanonicalPath());
  System.out.println("該檔案所在的目錄是:"+file.getParent());
  System.out.println("該檔案的路徑:"+file.getPath());
  //System.out.println("該檔案:"+file.getTotalSpace());
  //System.out.println("該檔案:"+file.getUsableSpace() );
  System.out.println("該檔案的修改日期是:"+new Date(file.lastModified()));
  System.out.println("該檔案的名稱:"+file.getName());
  System.out.println("該檔案是否是絕對路徑:"+(file.isAbsolute()?"是":"否"));
  System.out.println("該test.txt檔案是:"+(file.isDirectory()?"是目錄":(file.isFile()?"是檔案":"不是目錄也不是檔案")));
  System.out.println("該檔案是:"+(file.isHidden()?"隱藏":"不是隱藏"));
  System.out.println("該檔案的長度是:"+file.length());
  file.deleteOnExit();
  System.out.println(file.delete()?"刪除成功":"刪除失敗");
  File directorys=new File("abc\\def\\ggg");
  System.out.println("abc\\def\\ggg的目錄:"+(directorys.mkdirs()?"建立成功":"建立失敗"));
  File directory=new File("kkk");
  System.out.println("kkk的目錄:"+(directory.mkdir()?"建立成功":"建立失敗"));
  File file1=new File(directory,"test.txt");
  System.out.println("abc\\def\\ggg的目錄下的test.txt:"+(file1.createNewFile()?"建立成功":"建立失敗"));
  File file2=new File(directorys,"test.txt");
  System.out.println("kkk的目錄下的test.txt:"+(file2.createNewFile()?"建立成功":"建立失敗")); 
  
  
 }		
}	