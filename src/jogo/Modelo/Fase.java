package jogo.Modelo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Fase extends JPanel implements ActionListener {
    private Image fundo;
    private Player player;
    private Casa casa;
    private Timer timer;



    public Fase() {
        setFocusable(true);
        setDoubleBuffered(true);
        ImageIcon referencia = new ImageIcon("src/res/fundo.png");
        fundo = referencia.getImage();
        player = new Player();
        player.load();
        addKeyListener(new TecladoAdapter());
        timer = new Timer(5, this);
        timer.start();
        inicializarCasas();
    }
    public void inicializarCasas() {
        //int coordenadas[] = new int[4];
        //casa = new ArrayList<Casa>();
        casa = new Casa(200,200);
        casa.load();

    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null);
        graficos.drawImage(player.getImagem(),player.getX(),player.getY(),this);
        graficos.drawImage(casa.getImagem(),casa.getX(),casa.getY(),this);

        g.dispose();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        repaint();
    }
    private class TecladoAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }
        @Override
        public void keyReleased(KeyEvent e) {
            player.keyRelease(e);
        }
    }
}

//teste