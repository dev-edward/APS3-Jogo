package jogo.Modelo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.List;

public class Fase extends JPanel implements ActionListener {
    private int x,y;
    private Image fundo;
    private Player player;
    private Timer timer;
    private List<Casa> casas;
    private List<Rua> ruas;


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
        carregarObjetos();
    }
    public void carregarObjetos() {
        casas = new ArrayList<Casa>();
        casas.add(new Casa(100,100));
        casas.add(new Casa(300,300));
        casas.add(new Casa(500,500));

        ruas = new ArrayList<Rua>();
        ruas.add(new Rua(130,130,4,3));
        ruas.add(new Rua(130,260,4,2));
        ruas.add(new Rua(260,130,4,0));
        ruas.add(new Rua(260,260,4,1));

    }
    public void update(){
        x += 0;
        y += 0;
    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, this.x, this.y, null);
        graficos.drawImage(player.getImagem(), player.getX(), player.getY(), this);

        for (Rua rua : ruas) {
            rua.load();
            AffineTransform identity = new AffineTransform();
            AffineTransform trans = new AffineTransform();
            trans.setTransform(identity);
            trans.translate(rua.getX(), rua.getY());
            trans.rotate(Math.toRadians(90 * rua.getRotacao()), rua.getW() / 2, rua.getH() / 2);

            graficos.drawImage(rua.getImagem(), trans, this);

        }
        /*
        for (Casa casa : casas) {
            graficos.drawImage(casa.getImagem(), casa.getX(), casa.getY(), this);
            casa.load();
        }

         */
        g.dispose();

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        update();
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
