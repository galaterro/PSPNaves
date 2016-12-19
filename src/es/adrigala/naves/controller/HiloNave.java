package es.adrigala.naves.controller;

import es.adrigala.naves.model.Nave;

import javax.swing.*;

/**
 * Created by Adri on 19/12/2016.
 */
public class HiloNave extends Thread {
    JButton boton;
    private int numero;
    Nave n = new Nave(100,100, numero);

    public HiloNave(JButton boton, int numero){
        this.boton = boton;
        this.numero = numero;
    }

    @Override
    public void run() {
        super.run();
        boton.setLocation(n.getPosX(),n.getPosY());
        boton.setVisible(true);
    }
}
