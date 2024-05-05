package jogo.Modelo;

import javax.swing.*;
import java.awt.*;

public class OutrosObjetos{
    private Image imagem;
    private int x,y,t,r;
    private String caminho;
    private int largura,altura;

    public OutrosObjetos(int x, int y,int t, int r){
        this.x = x;
        this.y = y;
        this.t = t;
        this.r = r;
    }
    public void load(){
        switch (t) {
            case 1:
                caminho = "src/res/campo-futebol.png";
                break;
            case 2:
                caminho = "src/res/cassino.png";
                break;
            case 3:
                caminho = "src/res/condominio.png";
                break;
            case 4:
                caminho = "src/res/hospital.png";
                break;
            case 5:
                caminho = "src/res/mansao.png";
                break;
            case 6:
                caminho = "src/res/piscina.png";
                break;
            case 7:
                caminho = "src/res/piscina2.png";
                break;
            case 8:
                caminho = "src/res/predio.png";
                break;
            case 9:
                caminho = "src/res/solar.png";
                break;
            default:
                caminho = "src/res/fundo.png";
        }
        ImageIcon referencia = new ImageIcon(caminho);
        imagem = referencia.getImage();
        this.largura = imagem.getWidth(null);
        this.altura = imagem.getHeight(null);
    }
    public void update(){

    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public int getH() {
        return this.altura;
    }
    public int getW() {
        return this.largura;
    }
    public Image getImagem() {
        return this.imagem;
    }
    public int getRotacao(){
        return this.r;
    }


}
