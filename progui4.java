import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.*;

public class progui4 implements ActionListener, KeyListener{
  //properties
  JFrame theframe;
  AnimationPanel4 thepanel;
  Timer thetimer;
  boolean blnapressed = false;
  boolean blnspressed = false;
  boolean blndpressed = false;
  boolean blnwpressed = false;
  boolean blnleftarrow = false;
  boolean blnrightarrow = false;
  boolean blnuparrow = false;
  boolean blndownarrow = false;
  
  //methods
  public void actionPerformed(ActionEvent evt){
    if(evt.getSource() == thetimer){
      if(blnapressed){
        thepanel.intx = thepanel.intx - 2;
        Ellipse2D.Double ball = new Ellipse2D.Double(thepanel.intx, thepanel.inty, 50, 50);
        Rectangle2D.Double bar = new Rectangle2D.Double(150, 250, 200, 50);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0, 500, 500);
        if(ball.intersects(bar) || !screen.contains(ball.getBounds2D())){
          thepanel.intx = thepanel.intx + 2;
        }
        
      }else if(blndpressed){
        thepanel.intx = thepanel.intx + 2;
        
         Ellipse2D.Double ball = new Ellipse2D.Double(thepanel.intx, thepanel.inty, 50, 50);
        Rectangle2D.Double bar = new Rectangle2D.Double(150, 250, 200, 50);
         Rectangle2D.Double screen = new Rectangle2D.Double(0,0, 500, 500);
        if(ball.intersects(bar) || !screen.contains(ball.getBounds2D())){
          thepanel.intx = thepanel.intx -2;
        }
        
      }else if(blnspressed){
        thepanel.inty = thepanel.inty + 2;
         Ellipse2D.Double ball = new Ellipse2D.Double(thepanel.intx, thepanel.inty, 50, 50);
        Rectangle2D.Double bar = new Rectangle2D.Double(150, 250, 200, 50);
         Rectangle2D.Double screen = new Rectangle2D.Double(0,0, 500, 500);
        if(ball.intersects(bar) || !screen.contains(ball.getBounds2D())){
          thepanel.inty = thepanel.inty - 2;
        }
      }else if(blnwpressed){
        thepanel.inty = thepanel.inty - 2;
         Ellipse2D.Double ball = new Ellipse2D.Double(thepanel.intx, thepanel.inty, 50, 50);
        Rectangle2D.Double bar = new Rectangle2D.Double(150, 250, 200, 50);
        Rectangle2D.Double screen = new Rectangle2D.Double(0,0, 500, 500);
        if(ball.intersects(bar) || !screen.contains(ball.getBounds2D())){
          thepanel.inty = thepanel.inty + 2;
        }
      }
      thepanel.repaint();
    }
  }
  public void keyReleased(KeyEvent evt){
    if(evt.getKeyChar() == 'a'){
      blnapressed = false;
    }else if(evt.getKeyChar() == 'd'){
      blndpressed = false;
    }else if(evt.getKeyChar() == 's'){
      blnspressed = false;
    }else if(evt.getKeyChar() == 'w'){
      blnwpressed = false;
    }
    
    if(evt.getKeyCode() == 37){
      blnleftarrow = false;
    }else if(evt.getKeyCode() == 39){
      blnrightarrow = false;
    }else if(evt.getKeyCode() == 38){
      blnuparrow = false;
    }else if(evt.getKeyCode() == 40){
      blndownarrow = false;
    }
  }
  public void keyPressed(KeyEvent evt){
    
    if(evt.getKeyChar() == 'a'){
      blnapressed = true;
    }else if(evt.getKeyChar() == 'd'){
      blndpressed = true;
    }else if(evt.getKeyChar() == 's'){
      blnspressed = true;
    }else if(evt.getKeyChar() == 'w'){
      blnwpressed = true;
    }
    
    if(evt.getKeyCode() == 37){
      blnleftarrow = true;
    }else if(evt.getKeyCode() == 39){
      blnrightarrow = true;
    }else if(evt.getKeyCode() == 38){
      blnuparrow = true;
    }else if(evt.getKeyCode() == 40){
      blndownarrow = true;
    }
  }
  public void keyTyped(KeyEvent evt){
  }
  
  //constructors
  public progui4(){
    thepanel = new AnimationPanel4();
    thepanel.setPreferredSize(new Dimension(500,500));
    thepanel.setLayout(null);
    
    theframe = new JFrame("pro GUI 4");
    theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theframe.setContentPane(thepanel);
    theframe.pack();
    theframe.setVisible(true);
    theframe.addKeyListener(this);
    
    thetimer = new Timer(1000/60, this);
    thetimer.start();
  }
  
  //main method
  public static void main(String[] args){
    new progui4();
  }
}