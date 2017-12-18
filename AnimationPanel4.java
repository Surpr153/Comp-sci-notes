import java.awt.*;
import javax.swing.*;

public class AnimationPanel4 extends JPanel{
  //properties
  int intx = 425;
  int inty = 425;
  int intx2 = 0;
  int inty2 = 0;
  int intx3 = 60;
  int inty3 = 75;
  
  
  //methods
  //let's override how the boring JPanel paints
  //let's paint the panel the way we want
  public void paintComponent(Graphics g){
    g.setColor(Color.BLACK);
    g.fillRect(0,0,500,500);
    g.setColor(Color.WHITE);
    g.fillOval(intx,inty,50,50);
    //g.setColor(Color.RED);
    //g.fillOval(intx2,inty2,50,50);
    g.setColor(Color.WHITE);
    g.drawRect(150, 250, 200, 50);
  }
  
  //constructor
  public AnimationPanel4(){
    super();
  }
}