public class EX6
{
 public static void main(String argv[])
 {
  int cx=20,cy=12,r=12;
  MyCanvas mc=new MyCanvas();
  for(double d=0;d<2*Math.PI;d+=Math.PI/36)
  {
   int x=cx+(int)Math.round(r*Math.sin(d));
   int y=cy+(int)Math.round(r*Math.cos(d));
   mc.drawDot(x,y);
  }
  mc.showCanvas();
 }
}

class MyCanvas
{
 private boolean canvas[][]=new boolean[25][39];
 public void drawDot(int x,int y)
 {
  if(y<canvas.length && x<canvas[0].length)
  {
   canvas[y][x]=true;
  }
 }
 public void showCanvas()
 {
  for(int i=0;i<canvas.length;i++)
  {
   for(int j=0;j<canvas[0].length;j++)
   {
    if(canvas[i][j])
    {
     System.out.print('¡½');
    }
    else
    {
     System.out.print('¡¼');
    }
   }
   System.out.println();
  }
 }
 
 
}