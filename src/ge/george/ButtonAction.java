package ge.george;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction implements ActionListener {

    private boolean flag = false;
    private int[] board = new int[9];
    private int[] magicSquare = new int[]{4, 9, 2, 3, 5, 7, 8, 1, 6};


//    {
//        for (int i = 0; i < 9; i++) {
//
//            board[i] = -1;
//
//        }
//    }


    @Override
    public void actionPerformed(ActionEvent e) {
        TicTacToeButton source = (TicTacToeButton) e.getSource();

        source.setText(flag);
        int player = flag ? -1 : 1;
        board[source.getIndex()] = player;
        count++;
        if (hasWon(player)) {
            if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Play Again?", (flag ? "O" : "X") + " Won", JOptionPane.YES_NO_OPTION)) {//რას დაწერს
                Main.playAgain();
            } else { //არა ამთავრებს მთლიანად
                System.exit(0);
            }
        } else if (count == 9) {
            if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Play Again?", "ყაიმი", JOptionPane.YES_NO_OPTION)) {//რას დაწერს
                Main.playAgain();
            } else { //არა ამთავრებს მთლიანად
                System.exit(0);
            }
        }
        source.setEnabled(false);
        flag = !flag;

/*
        if (flag == false) { //სვლების გამოსაცვლელად ფლეგი გამოვიყენე
            source.setText("X"); // ბუტონზე რო გამოჩნდეს ....
            source.setFont(new Font("Arial", Font.BOLD, 100)); // ფონტი
//            source.removeActionListener(this);
            flag = true; //სვლა რო გადასულიყო...
            if (source.getName().equals("button1")) {              //სხვა გზა არ მქონდა მატრიცა როგორ უნდა შემევსო ვერ ოვიფიქრე სხვანაირად
                board[0] = 1;
            } else if (source.getName().equals("button2")) {
                board[1] = 1;
            } else if (source.getName().equals("button3")) {
                board[2] = 1;
            } else if (source.getName().equals("button4")) {
                board[3] = 1;
            } else if (source.getName().equals("button5")) {
                board[4] = 1;
            } else if (source.getName().equals("button6")) {
                board[5] = 1;
            } else if (source.getName().equals("button7")) {
                board[6] = 1;
            } else if (source.getName().equals("button8")) {
                board[7] = 1;
            } else {
                board[8] = 1;
            }
            checkIFDraw(); //counter ვზრდი აქ და თუ 9 იქნება ესეიგი ფრეა (ანუ მთლიანად შეივსო მატრიცა
            if (hasWon(1)) {
                int dialogButton = JOptionPane.YES_NO_OPTION; // რა ღილაკენი უნდა ამოაგდოს
                int dialogResult = JOptionPane.showConfirmDialog(null, "Play Again?", "X Won", dialogButton); //რას დაწერს
                if (dialogResult == JOptionPane.YES_OPTION) { //კის შემთხვევაში
                    Main.main(null);
                } else if (dialogResult == JOptionPane.NO_OPTION) { //არა ამთავრებს მთლიანად
                    System.exit(0);
                }
                ;
            } else if (count % 9 == 0) {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Play Again?", "DRAW", dialogButton);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    Main.main(null);


                } else if (dialogResult == JOptionPane.NO_OPTION) {
                    System.exit(0);
                }
            }
            source.setEnabled(false); //ვეღარ დააედითებს

        } else {
            source.setFont(new Font("Arial", Font.BOLD, 100));
            source.setText("O");
            flag = false;
            if (source.getName().equals("button1")) {
                board[0] = 0;
            } else if (source.getName().equals("button2")) {
                board[1] = 0;
            } else if (source.getName().equals("button3")) {
                board[2] = 0;
            } else if (source.getName().equals("button4")) {
                board[3] = 0;
            } else if (source.getName().equals("button5")) {
                board[4] = 0;
            } else if (source.getName().equals("button6")) {
                board[5] = 0;
            } else if (source.getName().equals("button7")) {
                board[6] = 0;
            } else if (source.getName().equals("button8")) {
                board[7] = 0;
            } else {
                board[8] = 0;
            }
            checkIFDraw();
            if (hasWon(0)) {

                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Play Again?", "O Won", dialogButton);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    Main.main(null);
                } else if (dialogResult == JOptionPane.NO_OPTION) {
                    System.exit(0);
                }
            } else if (count % 9 == 0) {

                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Play Again?", "DRAW", dialogButton);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    Main.main(null);

                } else if (dialogResult == JOptionPane.NO_OPTION) {
                    System.exit(0);
                }
            }
            source.setEnabled(false);

        }*/
    }

    private int count;

    private void checkIfDraw() {
        count++;
    }

    private boolean hasWon(int player) {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                for (int k = 0; k < 9; k++)
                    if (i != j && i != k && j != k)
                        if (board[i] == board[j] && board[j] == board[k] && board[k] == player)
                            if (magicSquare[i] + magicSquare[j] + magicSquare[k] == 15)
                                return true;
        return false;
    }
}

