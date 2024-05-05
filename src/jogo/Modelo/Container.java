package jogo.Modelo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Container extends JFrame implements ActionListener {
    JLayeredPane Camadas = new JLayeredPane();
    private DesenharFundo fundoCompleto = new DesenharFundo();
    private Mapa mapa = new Mapa();
    private Player player = new Player();
    private List<Arvore> arvores;
    private Timer timer;
    private int x,y;

    public Container(){
        setFocusable(true);
        //add(new Fase());
        setTitle("Jogo");
        setSize(1290, 1290);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        Camadas.setOpaque(false);
        CarregarFundo();
        CarregarMapa();
        CarregarPlayer();
        CarregarArvores();

        getContentPane().add(Camadas);
        //add(camadasFundo, BorderLayout.CENTER);
        //getContentPane().add(camadasFase);
        //camadasFase.setOpaque(false);


        setLocationRelativeTo(null);
        //this.setResizable(false);
        setVisible(true);

    }
    private void CarregarFundo(){
        fundoCompleto.setBounds(this.getBounds());
        Camadas.add(fundoCompleto);
        Camadas.setLayer(fundoCompleto, 1);
        add(Camadas, BorderLayout.CENTER);
        fundoCompleto.atualizarFundo(this.getWidth(), this.getHeight());
    }
    private void CarregarMapa(){
        mapa.setOpaque(false);
        mapa.setBounds(this.getBounds());
        Camadas.add(mapa);
        Camadas.setLayer(mapa, 2);
    }
    private void CarregarPlayer(){
        addKeyListener(new TecladoAdapter());
        timer = new Timer(5, this);
        timer.start();
        player.load();
        player.setOpaque(false);
        player.setBounds(this.getBounds());
        Camadas.add(player);
        Camadas.setLayer(player, 3);
    }
    private void CarregarArvores(){
        arvores = new ArrayList<Arvore>();

        arvores.add(new Arvore(5*130,390,1));
        arvores.add(new Arvore(22*130,390,1));
        arvores.add(new Arvore(23*130,390,1));
        arvores.add(new Arvore(24*130,390,1));

        arvores.add(new Arvore(5*130,650,1));
        arvores.add(new Arvore(12*130,650,2));
        arvores.add(new Arvore(13*130,650,1));
        arvores.add(new Arvore(14*130,650,2));
        arvores.add(new Arvore(15*130,650,1));

        arvores.add(new Arvore(12*130,780,1));
        arvores.add(new Arvore(24*130,780,1));

        arvores.add(new Arvore(12*130,910,2));

        arvores.add(new Arvore(12*130,1040,1));

        arvores.add(new Arvore(0*130,1170,2));
        arvores.add(new Arvore(12*130,1170,2));
        arvores.add(new Arvore(15*130,1170,1));

        arvores.add(new Arvore(12*130,1300,1));
        arvores.add(new Arvore(20*130,1300,1));
        arvores.add(new Arvore(22*130,1300,1));
        arvores.add(new Arvore(24*130,1300,1));

        arvores.add(new Arvore(4*130,1430,1));

        arvores.add(new Arvore(4*130,1560,1));
        arvores.add(new Arvore(12*130,1560,2));
        arvores.add(new Arvore(13*130,1560,2));

        arvores.add(new Arvore(0*130,1690,2));
        arvores.add(new Arvore(4*130,1690,1));
        arvores.add(new Arvore(19*130,1690,1));

        arvores.add(new Arvore(25*130,1820,1));
        arvores.add(new Arvore(26*130,1820,1));

        arvores.add(new Arvore(12*130,1950,1));
        arvores.add(new Arvore(13*130,1950,1));
        arvores.add(new Arvore(24*130,1950,1));

        arvores.add(new Arvore(24*130,2080,1));

        arvores.add(new Arvore(3*130,2210,1));
        arvores.add(new Arvore(24*130,2210,1));

        arvores.add(new Arvore(1*130,2340,2));
        arvores.add(new Arvore(3*130,2340,1));

        arvores.add(new Arvore(3*130,2470,1));
        arvores.add(new Arvore(10*130,2470,1));
        arvores.add(new Arvore(24*130,2470,1));

        arvores.add(new Arvore(1*130,2600,2));
        arvores.add(new Arvore(3*130,2600,1));
        arvores.add(new Arvore(10*130,2600,1));
        arvores.add(new Arvore(24*130,2600,1));
        arvores.add(new Arvore(28*130,2600,1));
        arvores.add(new Arvore(29*130,2600,1));

        arvores.add(new Arvore(3*130,2730,1));
        arvores.add(new Arvore(10*130,2730,1));
        arvores.add(new Arvore(21*130,2730,2));
        arvores.add(new Arvore(22*130,2730,2));

        arvores.add(new Arvore(3*130,2860,1));
        arvores.add(new Arvore(4*130,2860,1));
        arvores.add(new Arvore(5*130,2860,1));
        arvores.add(new Arvore(7*130,2860,1));
        arvores.add(new Arvore(8*130,2860,1));
        arvores.add(new Arvore(10*130,2860,1));
        arvores.add(new Arvore(11*130,2860,1));
        arvores.add(new Arvore(12*130,2860,1));
        arvores.add(new Arvore(14*130,2860,1));
        arvores.add(new Arvore(155*130,2860,1));
        arvores.add(new Arvore(28*130,2860,1));
        arvores.add(new Arvore(29*130,2860,1));

        arvores.add(new Arvore(5*130,3120,1));
        arvores.add(new Arvore(28*130,3120,1));
        arvores.add(new Arvore(29*130,3120,1));

        arvores.add(new Arvore(6*130,3380,2));
        arvores.add(new Arvore(14*130,3380,2));

        arvores.add(new Arvore(5*130,3770,2));
        arvores.add(new Arvore(6*130,3770,2));
        arvores.add(new Arvore(12*130,3770,2));
        arvores.add(new Arvore(13*130,3770,2));
        arvores.add(new Arvore(28*130,3770,2));
        arvores.add(new Arvore(29*130,3770,2));

        for(Arvore arvore : arvores){
            arvore.setBounds(this.getBounds());
            arvore.load();
            arvore.setOpaque(false);
            Camadas.add(arvore);
            Camadas.setLayer(arvore, 4);
        }
    }

    public void update(){
        x += 0;
        y += 0;
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

    public static void main(String[] args) {
        new Container();
    }

}
