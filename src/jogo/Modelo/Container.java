package jogo.Modelo;

import javax.swing.*;

public class Container extends JFrame{

    public Container(){
        add(new Fase());
        setTitle("Jogo");
        setSize(1024, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Container();
    }
}