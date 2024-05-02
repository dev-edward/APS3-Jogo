package jogo.Modelo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Rua extends JPanel {
    private Image imagem;
    private int x, y, t, r;
    private String caminho;
    private int largura, altura;

    public Rua(int x, int y, int t, int r) {
        this.x = x;
        this.y = y;
        this.t = t;
        this.r = r;
    }

    public void load() {
        switch (t) {
            case 1:
                caminho = "src/res/rua1.png";
                break;
            case 2:
                caminho = "src/res/rua2.png";
                break;
            case 3:
                caminho = "src/res/rua3.png";
                break;
            case 4:
                caminho = "src/res/rua4.png";
                break;
            case 5:
                caminho = "src/res/rua5.png";
                break;
            default:
                caminho = "src/res/rua1.png";
        }
        ImageIcon referencia = new ImageIcon(caminho);
        imagem = referencia.getImage();
        this.largura = imagem.getWidth(null);
        this.altura = imagem.getHeight(null);

    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int getH() {
        return altura;
    }

    public int getW() {
        return largura;
    }

    public Image getImagem() {
        return imagem;
    }
    public int getRotacao(){
        return r;
    }
}



