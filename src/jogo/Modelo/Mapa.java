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

public class Mapa extends JPanel{

    private List<Casa> casas;
    private List<Rua> ruas;
    private List<OutrosObjetos> objetos;

    public Mapa() {
        setDoubleBuffered(true);
        carregarObjetos();
    }

    public void carregarObjetos() {
        casas = new ArrayList<Casa>();
        casas.add(new Casa(0,0,1));
        casas.add(new Casa(910,0,1));
        casas.add(new Casa(0,390,4));
        casas.add(new Casa(0,910,1));

        ruas = new ArrayList<Rua>();
        ruas.add(new Rua(260,0,1,1));
        ruas.add(new Rua(780,0,1,1));
        ruas.add(new Rua(1170,0,1,1));
        ruas.add(new Rua(260,130,1,1));
        ruas.add(new Rua(780,130,1,1));
        ruas.add(new Rua(1170,130,1,1));
        ruas.add(new Rua(0,260,1,0));
        ruas.add(new Rua(130,260,1,0));
        ruas.add(new Rua(260,260,3,0));
        ruas.add(new Rua(390,260,1,0));
        ruas.add(new Rua(520,260,1,0));
        ruas.add(new Rua(650,260,1,0));
        ruas.add(new Rua(780,260,3,0));
        ruas.add(new Rua(910,260,1,0));
        ruas.add(new Rua(1040,260,1,0));
        ruas.add(new Rua(1170,260,3,0));
        ruas.add(new Rua(260,390,1,1));
        ruas.add(new Rua(780,390,1,1));
        ruas.add(new Rua(1170,390,1,1));
        ruas.add(new Rua(260,520,1,1));
        ruas.add(new Rua(780,520,1,1));
        ruas.add(new Rua(1170,520,1,1));
        ruas.add(new Rua(260,650,1,1));
        ruas.add(new Rua(780,650,1,1));
        ruas.add(new Rua(1170,650,1,1));
        ruas.add(new Rua(0,780,1,0));
        ruas.add(new Rua(130,780,1,0));
        ruas.add(new Rua(260,780,3,0));
        ruas.add(new Rua(390,780,1,0));
        ruas.add(new Rua(520,780,1,0));
        ruas.add(new Rua(650,780,1,0));
        ruas.add(new Rua(780,780,2,1));
        ruas.add(new Rua(1170,780,1,1));
        ruas.add(new Rua(260,910,1,1));
        ruas.add(new Rua(780,910,1,1));
        ruas.add(new Rua(1170,910,1,1));
        ruas.add(new Rua(260,1040,1,1));
        ruas.add(new Rua(780,1040,1,1));
        ruas.add(new Rua(1170,1040,1,1));
        ruas.add(new Rua(260,1170,1,1));
        ruas.add(new Rua(780,1170,4,1));
        ruas.add(new Rua(1170,1170,1,1));

        objetos = new ArrayList<OutrosObjetos>();
        objetos.add(new OutrosObjetos(390,0,8, 0));
        objetos.add(new OutrosObjetos(390,390,1,1));
        objetos.add(new OutrosObjetos(910,520,8,0));
        objetos.add(new OutrosObjetos(910,780,8,0));
        objetos.add(new OutrosObjetos(390,910,9,0));

    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graficos = (Graphics2D) g;

        for (Rua rua : ruas) {
            rua.load();
            AffineTransform identity = new AffineTransform();
            AffineTransform trans = new AffineTransform();
            trans.setTransform(identity);
            trans.translate(rua.getX(), rua.getY());
            trans.rotate(Math.toRadians(90 * rua.getRotacao()), rua.getW() / 2, rua.getH() / 2);
            graficos.drawImage(rua.getImagem(), trans, this);
        }
        for (Casa casa : casas) {
            graficos.drawImage(casa.getImagem(), casa.getX(), casa.getY(), this);
            casa.load();
        }
        for (OutrosObjetos objeto : objetos) {
            objeto.load();
            AffineTransform identity = new AffineTransform();
            AffineTransform trans = new AffineTransform();
            trans.setTransform(identity);
            trans.translate(objeto.getX(), objeto.getY());
            trans.rotate(Math.toRadians(90 * objeto.getRotacao()), objeto.getW() / 2, objeto.getH() / 2);
            graficos.drawImage(objeto.getImagem(), trans, this);

        }


        g.dispose();

    }

}
