import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlowLayout extends JFrame  {
    FlowLayout(){

        JButton bt1 = new JButton("Yes");
        JButton bt2 = new JButton("No");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new java.awt.FlowLayout());
        setSize(400,400);
        add(bt1);
        add(bt2);
        setVisible(true);
    }

    public static void main(String[] args) {

        new FlowLayout();

    }
}