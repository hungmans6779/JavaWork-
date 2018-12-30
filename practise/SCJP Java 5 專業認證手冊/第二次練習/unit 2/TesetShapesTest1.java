class  GameShape
{
 public void displayShape()
 {
  System.out.println("displaying shape");
 }
}

class PlayerPiece extends GameShape
{
 public void  movePiece()
 {
  System.out.println("moving game piece");
 }
}

class TitlePiece extends GameShape
{
 public void getAdjacent()
 {
  System.out.println("geting adjacent title");
 }
}

public class TesetShapesTest1
{
 public static void main(String argv[])
 {
  PlayerPiece player=new PlayerPiece();
  TitlePiece title=new TitlePiece();
  displayShape(player);
  displayShape(title);
 }
 public static  void displayShape(GameShape shape)
 {
  shape.displayShape();	
 }	
}