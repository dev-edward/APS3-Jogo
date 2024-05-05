package jogo.Modelo;
import javax.swing.*;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Player extends JComponent {
    public int spriteCounter = 0;
    public int spriteNum = 1;
    private int x,y;
    private int dx,dy;
    private Image imagem;
    private int altura,largura,velocidade;



    public Player() {
        this.x = 260;
        this.y = 20;
        this.velocidade = 3;


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

    public void temporizador() {
        Timer timer = new Timer();
        final long tempo = (70);
        TimerTask task = new TimerTask() {
            public void run() {
                spriteCounter++;
                if(spriteCounter > 0){
                    if(spriteNum == 1){
                        spriteNum = 2;
                    } else if (spriteNum == 2) {
                        spriteNum = 3;
                    }else{
                        spriteNum = 1;
                    }
                }
            }
        };
        timer.scheduleAtFixedRate(task,0,tempo);

    }

    public void trocaImagemPersonagem(String caminho){
        ImageIcon referencia = new ImageIcon(caminho);
        imagem = referencia.getImage();

    }

    public void keyPressed(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if(codigo == KeyEvent.VK_UP){
            dy=-velocidade;

            if (spriteNum == 1) {
                trocaImagemPersonagem("util/personagem/costa2.png");
            }
            if (spriteNum == 2) {
                trocaImagemPersonagem("util/personagem/costa3.png");
            }
            if (spriteNum == 3) {
                trocaImagemPersonagem("util/personagem/costa4.png");
            }
        }
        if(codigo == KeyEvent.VK_DOWN){
            dy=velocidade;
            if (spriteNum == 1) {
                trocaImagemPersonagem("util/personagem/frente2.png");
            }
            if (spriteNum == 2) {
                trocaImagemPersonagem("util/personagem/frente3.png");
            }
            if (spriteNum == 3) {
                trocaImagemPersonagem("util/personagem/frente4.png");
            }

        }
        if(codigo == KeyEvent.VK_LEFT){
            dx=-velocidade;
            if (spriteNum == 1) {
                trocaImagemPersonagem("util/personagem/lado-esquerdo2.png");
            }
            if (spriteNum == 2) {
                trocaImagemPersonagem("util/personagem/lado-esquerdo3.png");
            }
            if (spriteNum == 3) {
                trocaImagemPersonagem("util/personagem/lado-esquerdo4.png");
            }
        }
        if(codigo == KeyEvent.VK_RIGHT){
            dx=velocidade;
            if (spriteNum == 1) {
                trocaImagemPersonagem("util/personagem/lado-direito2.png");
            }
            if (spriteNum == 2) {
                trocaImagemPersonagem("util/personagem/lado-direito3.png");
            }
            if (spriteNum == 3) {
                trocaImagemPersonagem("util/personagem/lado-direito4.png");
            }
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
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(this.getImagem(), this.x, this.y, this);
        g.dispose();
    }

}
