package jogo.Modelo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class DesenharFundo extends JComponent {
    private int restoX,restoY;
    private List<Fundo> fundos;
    public DesenharFundo(){
        setDoubleBuffered(true);
        fundos = new ArrayList<Fundo>();
    }

    public void atualizarFundo(int largura,int altura){
        //Somente é instanciado o fundo que será visível pelo jogador
        int FemX,FemY =0;
        restoX = largura%130;
        restoY = altura%130;
        FemX = (int)Math.ceil(largura/130)+1;
        FemY = (int)Math.ceil(altura/130)+1;
        //Limpa os tiles da lista
        fundos.clear();
        //Adiciona novos tiles
        for(int i=0;i<FemX;i++){
            for(int j=0;j<FemY;j++){
                fundos.add(new Fundo(130*i,130*j));
            }
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graficos = (Graphics2D) g;
        for (Fundo fundo : fundos) {
            graficos.drawImage(fundo.getImagem(), fundo.getX(), fundo.getY(), this);
            fundo.load();
        }
        g.dispose();
    }
}
