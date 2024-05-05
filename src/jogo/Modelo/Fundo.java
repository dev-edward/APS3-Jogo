package jogo.Modelo;

import javax.swing.*;
import java.awt.*;

public class Fundo{
    private Image imagem;
    private int x,y;
    private int largura,altura;

    public Fundo(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void load(){
        ImageIcon referencia = new ImageIcon("src/res/fundo.png");
        imagem = referencia.getImage();
        this.largura = imagem.getWidth(null);
        this.altura = imagem.getHeight(null);
    }
    public void update(){

    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Image getImagem() {
        return imagem;
    }
}
