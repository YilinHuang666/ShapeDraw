import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class ButtonPanel extends JPanel {
    private JButton but1;
    private JButton but2;
    private JButton but3;

    public ButtonPanel(){
        but1=new JButton("Press me");
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World!");
            }
        });

        but2=new JButton("hit me");
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("I dont like you");
            }
        });

        but3=new JButton("beat me");
        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You cant beat me");
            }
        });


        add(but1);
        add(but2);
        add(but3);
        setLayout(new GridLayout(10,10)); // One row, one column
    }




}
