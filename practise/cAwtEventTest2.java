import java.awt.event.*;
public class cAwtEventTest2 implements ActionListener,AdjustmentListener,ItemListener,TextListener,
                                      ComponentListener,ContainerListener,FocusListener,WindowListener,
                                      KeyListener,MouseListener,MouseMotionListener
{
 public static void main(String argv[])
 {
 	
 }
 //Semantic Event
 public void actionPerformed(ActionEvent ae) {}
 public void adjustmentValueChanged(AdjustmentEvent ae1) {}
 public void 	itemStateChanged(ItemEvent ie) {}
 public void textValueChanged(TextEvent te) {}
 
 //low-level Event
 public void componentHidden(ComponentEvent ce1){}
 public void componentMoved(ComponentEvent ce2){}
 public void componentResized(ComponentEvent ce3){}
 public void componentShown(ComponentEvent ce4){}
 
 public void componentAdded(ContainerEvent cce1){}
 public void componentRemoved(ContainerEvent cce2){}
 
 public void focusGained(FocusEvent fe1){}
 public void focusLost(FocusEvent fe2){}
 
 public void windowActivated(WindowEvent we1){}
 public void windowDeactivated(WindowEvent we2){}
 public void windowIconified(WindowEvent we3){}
 public void windowDeiconified(WindowEvent we4){}
 public void windowOpened(WindowEvent we5){}
 public void windowClosed(WindowEvent we6){}
 public void windowClosing(WindowEvent we7){}
 
 public void keyPressed(KeyEvent ke1){}
 public void keyReleased(KeyEvent ke2){}
 public void keyTyped(KeyEvent ke3){}
 
 public void mouseClicked(MouseEvent me1){}
 public void mouseEntered(MouseEvent me2){}
 public void mouseExited(MouseEvent me3){}
 public void mousePressed(MouseEvent me4){}
 public void mouseReleased(MouseEvent me5){}
 public void mouseDragged(MouseEvent me6){}
 public void mouseMoved(MouseEvent me7){}
}