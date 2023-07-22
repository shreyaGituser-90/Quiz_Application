package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    
    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 180, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thank you " + name + " for playing Simple Minds");
        heading.setBounds(85, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 24));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(390, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.BOLD, 28));
        add(lblscore);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
    }
    
    public static void main(String[] args){
        new Score("User", 0);
    }
}
