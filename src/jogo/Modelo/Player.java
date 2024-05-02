package jogo.Modelo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Player {
    private int x,y;
    private int dx,dy;
    private Image imagem;
    private int altura,largura;

    public Player() {
        this.x = 10;
        this.y = 10;

    }
    public void load(){
        ImageIcon referencia = new ImageIcon("util/personagem/frente1.png");
        imagem = referencia.getImage();
        altura = imagem.getHeight(null);
        largura = imagem.getWidth(null);
    }
    public void update(){
        x += dx;
        y += dy;
    }
    public void keyPressed(KeyEvent tecla){
        int codigo = tecla.getKeyCode();
        if(codigo == KeyEvent.VK_UP){
            dy=-3;
            ImageIcon referencia = new ImageIcon("util/personagem/costa1.png");
            imagem = referencia.getImage();
        }
        if(codigo == KeyEvent.VK_DOWN){
            dy=3;
            ImageIcon referencia = new ImageIcon("util/personagem/frente1.png");
            imagem = referencia.getImage();
        }
        if(codigo == KeyEvent.VK_LEFT){
            dx=-3;
            ImageIcon referencia = new ImageIcon("util/personagem/lado-esquerdo1.png");
            imagem = referencia.getImage();
        }
        if(codigo == KeyEvent.VK_RIGHT){
            dx=3;
            ImageIcon referencia = new ImageIcon("util/personagem/lado-direito1.png");
            imagem = referencia.getImage();
        }
    }
    public void keyRelease(KeyEvent tecla){
        int codigo = tecla.getKeyCode();
        if(codigo == KeyEvent.VK_UP){
            dy=0;
        }
        if(codigo == KeyEvent.VK_DOWN){
            dy=0;
        }
        if(codigo == KeyEvent.VK_LEFT){
            dx=0;
        }
        if(codigo == KeyEvent.VK_RIGHT){
            dx=0;
        }
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public Image getImagem() {
        return imagem;
    }
}
