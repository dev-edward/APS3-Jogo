package jogo.Modelo;
import javax.swing.*;
import java.awt.*;

public class Casa {
    private Image imagem;
    private int x,y,t;
    private int largura,altura;
    private String caminho;

    public Casa(int x, int y,int t){
        this.x = x;
        this.y = y;
        this.t = t;
    }
    public void load(){
        switch (t) {
            case 1:
                caminho = "src/res/casa1.png";
                break;
            case 2:
                caminho = "src/res/casa2.png";
                break;
            case 3:
                caminho = "src/res/casa3.png";
                break;
            case 4:
                caminho = "src/res/casa4.png";
                break;
            default:
                caminho = "src/res/rua1.png";
        }
        ImageIcon referencia = new ImageIcon(caminho);
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
