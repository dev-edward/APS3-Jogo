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
        casas.add(new Casa(0*130,0,1));
        casas.add(new Casa(7*130,0,1));
        casas.add(new Casa(11*130,0,1));
        casas.add(new Casa(14*130,0,1));
        casas.add(new Casa(17*130,0,1));
        casas.add(new Casa(19*130,0,4));

        casas.add(new Casa(0*130,390,4));
        casas.add(new Casa(26*130,390,1));
        casas.add(new Casa(28*130,390,1));

        casas.add(new Casa(19*130,520,1));
        casas.add(new Casa(22*130,520,1));

        casas.add(new Casa(19*130,780,1));
        casas.add(new Casa(22*130,780,1));

        casas.add(new Casa(0*130,910,1));
        casas.add(new Casa(14*130,910,1));
        casas.add(new Casa(17*130,910,1));
        casas.add(new Casa(19*130,910,4));
        casas.add(new Casa(22*130,910,1));

        casas.add(new Casa(26*130,1170,4));
        casas.add(new Casa(28*130,1170,1));

        casas.add(new Casa(14*130,1300,1));
        casas.add(new Casa(17*130,1300,4));

        casas.add(new Casa(0*130,1430,4));

        casas.add(new Casa(10*130,1560,1));
        casas.add(new Casa(14*130,1560,1));
        casas.add(new Casa(17*130,1560,1));
        casas.add(new Casa(21*130,1560,1));
        casas.add(new Casa(25*130,1560,1));

        casas.add(new Casa(21*130,1950,1));

        casas.add(new Casa(0*130,2210,2));
        casas.add(new Casa(21*130,2210,1));

        casas.add(new Casa(0*130,2430,2));
        casas.add(new Casa(21*130,2430,1));
        casas.add(new Casa(28*130,2430,2));

        casas.add(new Casa(28*130,2600,2));

        casas.add(new Casa(21*130,2730,1));

        casas.add(new Casa(28*130,2860,2));

        casas.add(new Casa(0*130,2990,2));
        casas.add(new Casa(7*130,2990,2));
        casas.add(new Casa(14*130,2990,1));
        casas.add(new Casa(21*130,2990,1));

        casas.add(new Casa(0*130,3120,2));
        casas.add(new Casa(7*130,3120,2));
        casas.add(new Casa(28*130,3120,2));

        casas.add(new Casa(0*130,3250,2));
        casas.add(new Casa(7*130,3250,2));

        casas.add(new Casa(21*130,3380,1));

        casas.add(new Casa(22*130,3510,1));

        casas.add(new Casa(3*130,3640,1));
        casas.add(new Casa(7*130,3640,1));
        casas.add(new Casa(10*130,3640,1));
        casas.add(new Casa(14*130,3640,1));




        ruas = new ArrayList<Rua>();
        //linha1
        ruas.add(new Rua(260,0,1,1));
        ruas.add(new Rua(780,0,1,1));
        ruas.add(new Rua(1170,0,1,1));
        ruas.add(new Rua(2080,0,1,1));
        ruas.add(new Rua(2730,0,1,1));
        //linha2
        ruas.add(new Rua(260,130,1,1));
        ruas.add(new Rua(780,130,1,1));
        ruas.add(new Rua(1170,130,1,1));
        ruas.add(new Rua(2080,130,1,1));
        ruas.add(new Rua(2730,130,1,1));
        //linha3
        ruas.add(new Rua(0*130,260,1,0));
        ruas.add(new Rua(1*130,260,1,0));
        ruas.add(new Rua(2*130,260,3,0));
        ruas.add(new Rua(3*130,260,1,0));
        ruas.add(new Rua(4*130,260,1,0));
        ruas.add(new Rua(5*130,260,1,0));
        ruas.add(new Rua(6*130,260,3,0));
        ruas.add(new Rua(7*130,260,1,0));
        ruas.add(new Rua(8*130,260,1,0));
        ruas.add(new Rua(9*130,260,3,0));
        ruas.add(new Rua(10*130,260,1,0));
        ruas.add(new Rua(11*130,260,1,0));
        ruas.add(new Rua(12*130,260,1,0));
        ruas.add(new Rua(13*130,260,1,0));
        ruas.add(new Rua(14*130,260,1,0));
        ruas.add(new Rua(15*130,260,1,0));
        ruas.add(new Rua(16*130,260,3,0));
        ruas.add(new Rua(17*130,260,1,0));
        ruas.add(new Rua(18*130,260,1,0));
        ruas.add(new Rua(19*130,260,1,0));
        ruas.add(new Rua(20*130,260,1,0));
        ruas.add(new Rua(21*130,260,3,0));
        ruas.add(new Rua(22*130,260,1,0));
        ruas.add(new Rua(23*130,260,1,0));
        ruas.add(new Rua(24*130,260,1,0));
        ruas.add(new Rua(25*130,260,2,0));
        ruas.add(new Rua(26*130,260,1,0));
        ruas.add(new Rua(27*130,260,1,0));
        ruas.add(new Rua(28*130,260,1,0));
        ruas.add(new Rua(29*130,260,1,0));
        //linha4
        ruas.add(new Rua(2*130,390,1,1));
        ruas.add(new Rua(6*130,390,1,1));
        ruas.add(new Rua(9*130,390,1,1));
        ruas.add(new Rua(16*130,390,1,1));
        ruas.add(new Rua(21*130,390,1,1));
        ruas.add(new Rua(25*130,390,1,1));
        //linha5
        ruas.add(new Rua(2*130,520,1,1));
        ruas.add(new Rua(6*130,520,1,1));
        ruas.add(new Rua(9*130,520,1,1));
        ruas.add(new Rua(16*130,520,1,1));
        ruas.add(new Rua(21*130,520,1,1));
        ruas.add(new Rua(25*130,520,1,1));
        //linha6
        ruas.add(new Rua(2*130,650,1,1));
        ruas.add(new Rua(6*130,650,1,1));
        ruas.add(new Rua(9*130,650,1,1));
        ruas.add(new Rua(16*130,650,1,1));
        ruas.add(new Rua(21*130,650,1,1));
        ruas.add(new Rua(25*130,650,1,1));
        //linha7
        ruas.add(new Rua(0*130,780,1,0));
        ruas.add(new Rua(1*130,780,1,0));
        ruas.add(new Rua(2*130,780,3,0));
        ruas.add(new Rua(3*130,780,1,0));
        ruas.add(new Rua(4*130,780,1,0));
        ruas.add(new Rua(5*130,780,1,0));
        ruas.add(new Rua(6*130,780,2,1));
        ruas.add(new Rua(9*130,780,1,1));
        ruas.add(new Rua(13*130,780,4,3));
        ruas.add(new Rua(14*130,780,1,0));
        ruas.add(new Rua(15*130,780,1,0));
        ruas.add(new Rua(16*130,780,3,0));
        ruas.add(new Rua(17*130,780,1,0));
        ruas.add(new Rua(18*130,780,1,0));
        ruas.add(new Rua(19*130,780,1,0));
        ruas.add(new Rua(20*130,780,1,0));
        ruas.add(new Rua(21*130,780,3,0));
        ruas.add(new Rua(22*130,780,1,0));
        ruas.add(new Rua(23*130,780,1,0));
        ruas.add(new Rua(25*130,780,1,1));

        //linha8
        ruas.add(new Rua(2*130,910,1,1));
        ruas.add(new Rua(6*130,910,1,1));
        ruas.add(new Rua(9*130,910,1,1));
        ruas.add(new Rua(13*130,910,1,1));
        ruas.add(new Rua(16*130,910,1,1));
        ruas.add(new Rua(21*130,910,1,1));
        ruas.add(new Rua(15*130,910,1,1));
        //linha9
        ruas.add(new Rua(2*130,1040,1,1));
        ruas.add(new Rua(6*130,1040,1,1));
        ruas.add(new Rua(9*130,1040,1,1));
        ruas.add(new Rua(13*130,1040,1,1));
        ruas.add(new Rua(16*130,1040,1,1));
        ruas.add(new Rua(21*130,1040,1,1));
        ruas.add(new Rua(25*130,1040,4,3));
        ruas.add(new Rua(26*130,1040,0,1));
        ruas.add(new Rua(27*130,1040,0,1));
        ruas.add(new Rua(28*130,1040,0,1));
        ruas.add(new Rua(29*130,1040,0,1));
        //linha10
        ruas.add(new Rua(2*130,1170,1,1));
        ruas.add(new Rua(6*130,1170,1,1));
        ruas.add(new Rua(9*130,1170,1,1));
        ruas.add(new Rua(13*130,1170,1,1));
        ruas.add(new Rua(16*130,1170,2,3));
        ruas.add(new Rua(17*130,1170,1,0));
        ruas.add(new Rua(18*130,1170,1,0));
        ruas.add(new Rua(19*130,1170,1,0));
        ruas.add(new Rua(21*130,1170,1,1));
        //linha11
        ruas.add(new Rua(0*130,1300,1,0));
        ruas.add(new Rua(1*130,1300,1,0));
        ruas.add(new Rua(2*130,1300,3,0));
        ruas.add(new Rua(3*130,1300,1,0));
        ruas.add(new Rua(4*130,1300,1,0));
        ruas.add(new Rua(5*130,1300,1,0));
        ruas.add(new Rua(6*130,1300,2,2));
        ruas.add(new Rua(7*130,1300,1,0));
        ruas.add(new Rua(8*130,1300,1,0));
        ruas.add(new Rua(9*130,1300,2,1));
        ruas.add(new Rua(13*130,1300,1,1));
        ruas.add(new Rua(16*130,1300,1,1));
        ruas.add(new Rua(21*130,1300,1,1));
        //linha12
        ruas.add(new Rua(2*130,1430,1,1));
        ruas.add(new Rua(9*130,1430,2,3));
        ruas.add(new Rua(10*130,1430,1,0));
        ruas.add(new Rua(11*130,1430,1,0));
        ruas.add(new Rua(12*130,1430,1,0));
        ruas.add(new Rua(13*130,1430,4,1));
        ruas.add(new Rua(16*130,1430,1,1));
        ruas.add(new Rua(20*130,1430,4,3));
        ruas.add(new Rua(21*130,1430,2,2));
        ruas.add(new Rua(22*130,1430,1,0));
        ruas.add(new Rua(23*130,1430,1,0));
        ruas.add(new Rua(24*130,1430,1,0));
        ruas.add(new Rua(25*130,1430,1,0));
        ruas.add(new Rua(26*130,1430,1,0));
        ruas.add(new Rua(27*130,1430,1,0));
        ruas.add(new Rua(28*130,1430,1,0));
        ruas.add(new Rua(29*130,1430,1,0));
        //linha13
        ruas.add(new Rua(2*130,1560,1,1));
        ruas.add(new Rua(9*130,1560,1,1));
        ruas.add(new Rua(16*130,1560,1,1));
        ruas.add(new Rua(20*130,1560,1,1));
        ruas.add(new Rua(24*130,1560,1,1));
        ruas.add(new Rua(27*130,1560,1,1));
        //linha14
        ruas.add(new Rua(2*130,1690,1,1));
        ruas.add(new Rua(9*130,1690,1,1));
        ruas.add(new Rua(16*130,1690,1,1));
        ruas.add(new Rua(20*130,1690,1,1));
        ruas.add(new Rua(24*130,1690,1,1));
        ruas.add(new Rua(27*130,1690,1,1));
        //linha15
        ruas.add(new Rua(2*130,1820,1,0));
        ruas.add(new Rua(4*130,1820,4,3));
        ruas.add(new Rua(5*130,1820,1,0));
        ruas.add(new Rua(6*130,1820,1,0));
        ruas.add(new Rua(7*130,1820,1,0));
        ruas.add(new Rua(8*130,1820,1,0));
        ruas.add(new Rua(9*130,1820,3,0));
        ruas.add(new Rua(10*130,1820,1,0));
        ruas.add(new Rua(11*130,1820,1,0));
        ruas.add(new Rua(12*130,1820,1,0));
        ruas.add(new Rua(13*130,1820,1,0));
        ruas.add(new Rua(14*130,1820,1,0));
        ruas.add(new Rua(15*130,1820,1,0));
        ruas.add(new Rua(16*130,1820,3,0));
        ruas.add(new Rua(17*130,1820,1,0));
        ruas.add(new Rua(18*130,1820,1,0));
        ruas.add(new Rua(19*130,1820,1,0));
        ruas.add(new Rua(20*130,1820,3,0));
        ruas.add(new Rua(21*130,1820,1,0));
        ruas.add(new Rua(22*130,1820,1,0));
        ruas.add(new Rua(23*130,1820,1,0));
        ruas.add(new Rua(24*130,1820,4,1));
        ruas.add(new Rua(27*130,1820,1,1));
        //linha16
        ruas.add(new Rua(2*130,1950,1,1));
        ruas.add(new Rua(4*130,1950,1,1));
        ruas.add(new Rua(9*130,1950,1,1));
        ruas.add(new Rua(16*130,1950,1,1));
        ruas.add(new Rua(20*130,1950,1,1));
        ruas.add(new Rua(27*130,1950,1,1));
        //linha17
        ruas.add(new Rua(0*130,2080,1,0));
        ruas.add(new Rua(1*130,2080,1,0));
        ruas.add(new Rua(2*130,2080,3,0));
        ruas.add(new Rua(3*130,2080,1,0));
        ruas.add(new Rua(4*130,2080,2,1));
        ruas.add(new Rua(9*130,2080,1,1));
        ruas.add(new Rua(16*130,2080,1,1));
        ruas.add(new Rua(20*130,2080,1,1));
        ruas.add(new Rua(27*130,2080,1,1));
        //linha18
        ruas.add(new Rua(2*130,2210,1,1));
        ruas.add(new Rua(4*130,2210,1,1));
        ruas.add(new Rua(9*130,2210,1,1));
        ruas.add(new Rua(16*130,2210,1,1));
        ruas.add(new Rua(20*130,2210,1,1));
        ruas.add(new Rua(27*130,2210,1,1));
        //linha19
        ruas.add(new Rua(2*130,2340,1,1));
        ruas.add(new Rua(4*130,2340,4,2));
        ruas.add(new Rua(5*130,2340,1,0));
        ruas.add(new Rua(6*130,2340,1,0));
        ruas.add(new Rua(7*130,2340,1,0));
        ruas.add(new Rua(8*130,2340,1,0));
        ruas.add(new Rua(9*130,2340,3,0));
        ruas.add(new Rua(10*130,2340,1,0));
        ruas.add(new Rua(11*130,2340,1,0));
        ruas.add(new Rua(12*130,2340,1,0));
        ruas.add(new Rua(13*130,2340,1,0));
        ruas.add(new Rua(14*130,2340,1,0));
        ruas.add(new Rua(15*130,2340,1,0));
        ruas.add(new Rua(16*130,2340,3,0));
        ruas.add(new Rua(17*130,2340,1,0));
        ruas.add(new Rua(18*130,2340,1,0));
        ruas.add(new Rua(19*130,2340,1,0));
        ruas.add(new Rua(20*130,2340,2,1));
        ruas.add(new Rua(23*130,2340,4,3));
        ruas.add(new Rua(24*130,2340,1,0));
        ruas.add(new Rua(25*130,2340,1,0));
        ruas.add(new Rua(26*130,2340,1,0));
        ruas.add(new Rua(27*130,2340,3,0));
        ruas.add(new Rua(28*130,2340,1,0));
        ruas.add(new Rua(29*130,2340,1,0));
        //linha20
        ruas.add(new Rua(2*130,2470,1,1));
        ruas.add(new Rua(9*130,2470,1,1));
        ruas.add(new Rua(16*130,2470,1,1));
        ruas.add(new Rua(20*130,2470,1,1));
        ruas.add(new Rua(23*130,2470,1,1));
        ruas.add(new Rua(27*130,2470,1,1));
        //linha21
        ruas.add(new Rua(2*130,2600,1,1));
        ruas.add(new Rua(9*130,2600,1,1));
        ruas.add(new Rua(16*130,2600,1,1));
        ruas.add(new Rua(20*130,2600,1,1));
        ruas.add(new Rua(23*130,2600,1,1));
        ruas.add(new Rua(27*130,2600,1,1));
        //linha22
        ruas.add(new Rua(2*130,2730,1,1));
        ruas.add(new Rua(9*130,2730,1,1));
        ruas.add(new Rua(16*130,2730,1,1));
        ruas.add(new Rua(20*130,2730,1,1));
        ruas.add(new Rua(23*130,2730,2,3));
        ruas.add(new Rua(24*130,2730,1,0));
        ruas.add(new Rua(25*130,2730,1,0));
        ruas.add(new Rua(26*130,2730,1,0));
        ruas.add(new Rua(27*130,2730,2,1));
        //linha23
        ruas.add(new Rua(2*130,2860,1,1));
        ruas.add(new Rua(6*130,2860,1,1));
        ruas.add(new Rua(9*130,2860,1,1));
        ruas.add(new Rua(13*130,2860,1,1));
        ruas.add(new Rua(16*130,2860,1,1));
        ruas.add(new Rua(20*130,2860,1,1));
        ruas.add(new Rua(23*130,2860,1,1));
        ruas.add(new Rua(27*130,2860,1,1));
        //linha24
        ruas.add(new Rua(0*130,2990,1,0));
        ruas.add(new Rua(1*130,2990,1,0));
        ruas.add(new Rua(2*130,2990,3,0));
        ruas.add(new Rua(3*130,2990,1,0));
        ruas.add(new Rua(4*130,2990,1,0));
        ruas.add(new Rua(5*130,2990,1,0));
        ruas.add(new Rua(6*130,2990,3,0));
        ruas.add(new Rua(7*130,2990,1,0));
        ruas.add(new Rua(8*130,2990,1,0));
        ruas.add(new Rua(9*130,2990,3,0));
        ruas.add(new Rua(10*130,2990,1,0));
        ruas.add(new Rua(11*130,2990,1,0));
        ruas.add(new Rua(12*130,2990,1,0));
        ruas.add(new Rua(13*130,2990,3,0));
        ruas.add(new Rua(14*130,2990,1,0));
        ruas.add(new Rua(15*130,2990,1,0));
        ruas.add(new Rua(16*130,2990,2,2));
        ruas.add(new Rua(17*130,2990,1,0));
        ruas.add(new Rua(18*130,2990,1,0));
        ruas.add(new Rua(19*130,2990,1,0));
        ruas.add(new Rua(20*130,2990,2,1));
        ruas.add(new Rua(23*130,2990,1,1));
        ruas.add(new Rua(27*130,2990,1,1));
        //linha25
        ruas.add(new Rua(2*130,3120,1,1));
        ruas.add(new Rua(6*130,3120,1,1));
        ruas.add(new Rua(9*130,3120,1,1));
        ruas.add(new Rua(13*130,3120,1,1));
        ruas.add(new Rua(20*130,3120,1,1));
        ruas.add(new Rua(23*130,3120,1,1));
        ruas.add(new Rua(27*130,3120,1,1));
        //linha26
        ruas.add(new Rua(2*130,3250,1,1));
        ruas.add(new Rua(5*130,3250,4,3));
        ruas.add(new Rua(6*130,3250,4,1));
        ruas.add(new Rua(9*130,3250,1,1));
        ruas.add(new Rua(13*130,3250,1,1));
        ruas.add(new Rua(20*130,3250,1,1));
        ruas.add(new Rua(23*130,3250,1,1));
        ruas.add(new Rua(27*130,3250,1,1));
        //linha27
        ruas.add(new Rua(2*130,3380,1,1));
        ruas.add(new Rua(5*130,3380,1,1));
        ruas.add(new Rua(9*130,3380,1,1));
        ruas.add(new Rua(13*130,3380,1,1));
        ruas.add(new Rua(16*130,3380,4,3));
        ruas.add(new Rua(17*130,3380,1,0));
        ruas.add(new Rua(18*130,3380,1,0));
        ruas.add(new Rua(19*130,3380,1,0));
        ruas.add(new Rua(20*130,3380,3,0));
        ruas.add(new Rua(21*130,3380,1,0));
        ruas.add(new Rua(22*130,3380,1,0));
        ruas.add(new Rua(23*130,3380,3,0));
        ruas.add(new Rua(24*130,3380,1,0));
        ruas.add(new Rua(25*130,3380,1,0));
        ruas.add(new Rua(26*130,3380,1,0));
        ruas.add(new Rua(27*130,3380,3,0));
        ruas.add(new Rua(28*130,3380,1,0));
        ruas.add(new Rua(29*130,3380,1,0));
        //linha28
        ruas.add(new Rua(0*130,3510,1,0));
        ruas.add(new Rua(1*130,3510,1,0));
        ruas.add(new Rua(2*130,3510,3,0));
        ruas.add(new Rua(3*130,3510,1,0));
        ruas.add(new Rua(4*130,3510,1,0));
        ruas.add(new Rua(5*130,3510,2,2));
        ruas.add(new Rua(6*130,3510,1,0));
        ruas.add(new Rua(7*130,3510,1,0));
        ruas.add(new Rua(8*130,3510,1,0));
        ruas.add(new Rua(9*130,3510,3,0));
        ruas.add(new Rua(10*130,3510,1,0));
        ruas.add(new Rua(11*130,3510,1,0));
        ruas.add(new Rua(12*130,3510,1,0));
        ruas.add(new Rua(13*130,3510,4,1));
        ruas.add(new Rua(16*130,3510,1,1));
        ruas.add(new Rua(20*130,3510,1,1));
        ruas.add(new Rua(23*130,3510,1,1));
        ruas.add(new Rua(27*130,3510,1,1));
        //linha29
        ruas.add(new Rua(2*130,3640,1,1));
        ruas.add(new Rua(9*130,3640,1,1));
        ruas.add(new Rua(16*130,3640,1,1));
        ruas.add(new Rua(20*130,3640,1,1));
        ruas.add(new Rua(23*130,3640,1,1));
        ruas.add(new Rua(27*130,3640,1,1));
        //linha30
        ruas.add(new Rua(2*130,3770,1,1));
        ruas.add(new Rua(9*130,3770,1,1));
        ruas.add(new Rua(16*130,3770,1,1));
        ruas.add(new Rua(20*130,3770,1,1));
        ruas.add(new Rua(23*130,3770,1,1));
        ruas.add(new Rua(27*130,3770,1,1));

        objetos = new ArrayList<OutrosObjetos>();

        //campo-futebol
        objetos.add(new OutrosObjetos(3*130,390,1,0));
        objetos.add(new OutrosObjetos(10*130,1950,1,0));
        objetos.add(new OutrosObjetos(14*130,1950,1,0));
        objetos.add(new OutrosObjetos(25*130,1950,1,0));
        objetos.add(new OutrosObjetos(3*130,3120,1,0));
        //condominio
        objetos.add(new OutrosObjetos(12*130,0,3, 0));
        //hospital
        casas.add(new Casa(5*130,1430,4));
        //mansao
        objetos.add(new OutrosObjetos(4*130,2470,5, 0));
        objetos.add(new OutrosObjetos(11*130,2470,5, 0));
        //piscina
        objetos.add(new OutrosObjetos(10*130,0,6, 0));
        objetos.add(new OutrosObjetos(13*130,0,6, 0));
        objetos.add(new OutrosObjetos(24*130,520,6, 0));
        objetos.add(new OutrosObjetos(12*130,2080,7, 0));
        objetos.add(new OutrosObjetos(13*130,2080,7, 2));
        objetos.add(new OutrosObjetos(0*130,2340,6, 0));
        objetos.add(new OutrosObjetos(0*130,2600,6, 0));
        //predio
        objetos.add(new OutrosObjetos(3*130,0,8, 0));
        objetos.add(new OutrosObjetos(7*130,520,8, 0));
        objetos.add(new OutrosObjetos(7*130,780,8, 0));
        objetos.add(new OutrosObjetos(7*130,1040,8, 0));
        objetos.add(new OutrosObjetos(28*130,1560,8, 0));
        objetos.add(new OutrosObjetos(0*130,1820,8, 0));
        objetos.add(new OutrosObjetos(28*130,1820,8, 0));
        objetos.add(new OutrosObjetos(18*130,2080,8, 0));
        objetos.add(new OutrosObjetos(28*130,2080,8, 0));
        objetos.add(new OutrosObjetos(25*130,2470,8, 0));
        objetos.add(new OutrosObjetos(0*130,2730,8, 0));
        objetos.add(new OutrosObjetos(18*130,3120,8, 0));
        objetos.add(new OutrosObjetos(17*130,3510,8, 2));
        objetos.add(new OutrosObjetos(28*130,3510,8, 0));
        objetos.add(new OutrosObjetos(0*130,3640,8, 3));
        //solar
        objetos.add(new OutrosObjetos(3*130,910,9,0));
        objetos.add(new OutrosObjetos(10*130,3120,9,0));
        objetos.add(new OutrosObjetos(24*130,3510,9,0));


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
