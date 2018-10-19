package Notatnikv2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu mPliki, mPomoc;

Start()
{
    super ("Notatnik");
    menuBar = new JMenuBar();

    mPliki = new JMenu("Pliki");
    mPomoc = new JMenu("Pomoc");

    menuBar.add(mPliki);menuBar.add(mPomoc);
    

    setJMenuBar(menuBar);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600,500);
    setLocationRelativeTo(null);
    setVisible(true);
}
    public static void main(String[] args) {
        new Start();


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
