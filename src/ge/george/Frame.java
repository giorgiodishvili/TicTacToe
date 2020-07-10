package ge.george;

import javax.swing.*;

public class Frame extends JFrame {
    private Panel comp;

    {
        comp = new Panel();
        //setSize(500, 500);
        setTitle("TicTacToe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        // remove(new Panel());
        add(comp);
        pack();
        setVisible(true);

    }

    public void playAgain() {
        remove(comp);
        comp = new Panel();
        add(comp);
        pack();
        doLayout();
    }


}