package ru.gb.siyanov;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Calculator  {
    private JFrame window;

    public Calculator()  {
         window = new JFrame("Calculator");
         window.setSize(260,347);
         window.add(new Panel());
         window.setLocale(null);
         window.setResizable(false);
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         window.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator();

            }
        });

    }
}
