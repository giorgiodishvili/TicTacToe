package ge.george;

import javax.swing.*;
import java.awt.*;

public class TicTacToeButton extends JButton {
    private int index;


    public TicTacToeButton(int index) {
        this.index = index;
        setFont(new Font("Arial", Font.BOLD, 100));
    }

    public void setText(boolean flag) {
        setText(flag ? "O" : "X");
    }


    public int getIndex() {
        return index;
    }
}
