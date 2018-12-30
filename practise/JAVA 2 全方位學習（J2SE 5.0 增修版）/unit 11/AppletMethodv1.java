public class AppletMethodv1 extends java.applet.Applet
{
 public void init()
 {
  System.out.println("init");
 }
 public void start()
 {
  showMessage("start");
 }
 public void stop()
 {
  showMessage("stop");
 }
 public void destroy()
 {
  showMessage("destroy");
 }
  
 public void showMessage(String str)
 {
  System.out.println(str);
 } 
}