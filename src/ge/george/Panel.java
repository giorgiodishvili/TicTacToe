package ge.george;

import javax.swing.*;
import java.awt.*;


public class Panel extends JPanel {
    //button masivi ვფიქრობდი მაგრამ საბოლოოდ ესე გადავწყვიტე
//    private JButton button1 = new JButton();
//    private JButton button2 = new JButton();
//    private JButton button3 = new JButton();
//    private JButton button4 = new JButton();
//    private JButton button5 = new JButton();
//    private JButton button6 = new JButton();
//    private JButton button7 = new JButton();
//    private JButton button8 = new JButton();
//    private JButton button9 = new JButton();

    {
        ButtonAction buttonAction = new ButtonAction();
//        button1.addActionListener(buttonAction);
//        button2.addActionListener(buttonAction);
//        button3.addActionListener(buttonAction);
//        button4.addActionListener(buttonAction);
//        button5.addActionListener(buttonAction);
//        button6.addActionListener(buttonAction);
//        button7.addActionListener(buttonAction);
//        button8.addActionListener(buttonAction);
//        button9.addActionListener(buttonAction);
//        button1.setName("button1");
//        button2.setName("button2");
//        button3.setName("button3");
//        button4.setName("button4");
//        button5.setName("button5");
//        button6.setName("button6");
//        button7.setName("button7");
//        button8.setName("button8");
//        button9.setName("button9");


        setLayout(new GridBagLayout());
//        button1.setPreferredSize(new Dimension(256, 256));
//        button2.setPreferredSize(new Dimension(256, 256));
//        button3.setPreferredSize(new Dimension(256, 256));
//        button4.setPreferredSize(new Dimension(256, 256));
//        button5.setPreferredSize(new Dimension(256, 256));
//        button6.setPreferredSize(new Dimension(256, 256));
//        button7.setPreferredSize(new Dimension(256, 256));
//        button8.setPreferredSize(new Dimension(256, 256));
//        button9.setPreferredSize(new Dimension(256, 256));
        int counter=0;
        for (int y = 0; y <3 ; y++) {
            for (int x = 0; x <3 ; x++) {
                JButton button  = new TicTacToeButton(counter++);
                button.addActionListener(buttonAction);
                button.setPreferredSize(new Dimension(256, 256));
                this.add(x,y,button);
            }
        }

//        this.add(0, 0, button1);
//        this.add(1, 0, button2);
//        this.add(2, 0, button3);
//        this.add(0, 1, button4);
//        this.add(1, 1, button5);
//        this.add(2, 1, button6);
//        this.add(0, 2, button7);
//        this.add(1, 2, button8);
//        this.add(2, 2, button9);
        doLayout();
        setVisible(true);


    }

    private void add(int x, int y, Component component) {
        this.add(x, y, component, 1);
    }

    private void add(int x, int y, Component component, int gridWidth) {

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = gridWidth;
        this.add(component, gbc);

    }

}
