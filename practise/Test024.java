import java.applet.Applet;
public class Test024 extends Applet
{
 public void init()
 {
 	System.out.println("=======================");
  System.out.println("init");
 }
 public void start()
 {
  showMsg("start");
 }
 public void stop()
 {
  showMsg("stop");
 }
 public void destory()
 {
  showMsg("destory");
 }
 public void showMsg(String str)
 {
  System.out.println(str);
 }
}