import java.awt.*;
import javax.swing.*;

public class BoxLayout extends Frame {
    Button buttons[];

    public BoxLayout () {
        buttons = new Button [5];

        for (int i = 0;i<5;i++) {
            buttons[i] = new Button ("Button " + (i + 1));
            add (buttons[i]);
        }
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String args[]){
        BoxLayout b=new BoxLayout();
    }
}
