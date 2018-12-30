import java.awt.event.*;
import java.awt.*;
public class AwtEventTest1 implements ActionListener,AdjustmentListener,ItemListener,TextListener,
                                    ComponentListener,ContainerListener,FocusListener,KeyListener,MouseListener,MouseMotionListener,WindowListener
{
 public static void main(String argvc[])
 {}
 public void actionPerformed(ActionEvent ae1){}
 public void adjustmentValueChanged(AdjustmentEvent ae2) {}
 public void itemStateChanged(ItemEvent ie){}
 public void textValueChanged(TextEvent te){}
 
 public void componentHidden(ComponentEvent ce){}
 public void componentMoved(ComponentEvent ce){}
 public void componentResized(ComponentEvent ce){}
 public void componentShown(ComponentEvent ce){}
 
 public void componentAdded(ContainerEvent ce){}
 public void componentRemoved(ContainerEvent ce){}
 
 public void focusGained(FocusEvent fe){}
 public void focusLost(FocusEvent fe){}
 
 public void keyPressed(KeyEvent ie){}
 public void keyReleased(KeyEvent ie){}
 public void keyTyped(KeyEvent ie){}
 
 public void mouseClicked(MouseEvent me){}
 public void mouseEntered(MouseEvent me){}
 public void mouseExited(MouseEvent me){}
 public void mousePressed(MouseEvent me){}
 public void mouseReleased(MouseEvent me){}
 
 public void mouseDragged(MouseEvent mme){}
 public void mouseMoved(MouseEvent mme){}
 
 public void windowActivated(WindowEvent we){}
 public void windowDeactivated(WindowEvent me){}
 public void windowIconified(WindowEvent me){}
 public void windowDeiconified(WindowEvent me){}
 public void windowClosed(WindowEvent me){}
 public void windowOpend(WindowEvent me){}
 public void windowClosing(WindowEvent me){}
 
}