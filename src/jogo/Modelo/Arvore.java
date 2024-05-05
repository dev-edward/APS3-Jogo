package jogo.Modelo;

import javax.swing.*;
import java.awt.*;

public class Arvore extends JComponent{
    private Image imagem;
    private int x,y,t;
    private int largura,altura;
    private String caminho;

    public Arvore(int x, int y,int t){
        this.x = x;
        this.y = y;
        this.t = t;
    }
    public void load(){
        switch (t) {
            case 1:
                caminho = "src/res/arvore1.png";
                break;
            case 2:
                caminho = "src/res/arvore2.png";
                break;
            default:
                caminho = "src/res/arvore1.png";
        }
        ImageIcon referencia = new ImageIcon(caminho);
        imagem = referencia.getImage();
        this.largura = imagem.getWidth(null);
        this.altura = imagem.getHeight(null);
    }
    public void update(){

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(this.imagem, this.x, this.y, this);
        g.dispose();
    }
}
