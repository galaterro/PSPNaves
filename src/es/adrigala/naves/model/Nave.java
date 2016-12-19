package es.adrigala.naves.model;

/**
 * Created by Adri on 19/12/2016.
 */
public class Nave {
    private int posX;
    private int posY;
    private int numero;

    public Nave(int posX, int posY, int numero) {
        this.posX = posX;
        this.posY = posY;
        this.numero = numero;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
