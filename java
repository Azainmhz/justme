package java.swing;

import java.swing.*;
import java.awt.*;                                                  
import java.awt.event.*;
import javax.swing.JFrame;
public class Color extends Frame
{
  private JLabel messageLabel;
  private JButton redButton;
  private JPanel panel;
  private final int WINDOW_WIDTH = 200; 
  private final int WINDOW_HEIGHT = 125; 
public Color()
         {
  setTitle("Colors");
  setSize(WINDOW_WIDTH, WINDOW_HEIGHT); 
  setDefaultCloseOperation(JFrame.EXIT);
  messageLabel = new JLabel("Click the button to " + "apply red color.");  
  redButton = new JButton("Red");
  redButton = new JButton("Red");
  redButton.addActionListener(new RedButtonListener());
  panel = new JPanel();
  panel.add(messageLabel);
  panel.add(redButton);
  add(panel);
  setVisible(true);
         }
 private class RedButtonListener implements ActionListener
 {
  public void actionPerformed(ActionEvent e)
  {
   panel.setBackground(Color.RED); 
   messageLabel.setForeground(Color.blue);
  }
}
public static void main(String[] args)
{
    new color();
}
}

