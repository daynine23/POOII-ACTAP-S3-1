/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

/**
 *
 * @author Kevin Cabezas
 */
public class Punto {
    private int X;
    private int Y;

    public Punto(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
    
    public Punto() {
        this.X = 0;
        this.Y = 0;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
    
    public double getDistance(Punto otroPunto) {
        double deltaX = otroPunto.X - this.X;
        double deltaY = otroPunto.Y - this.Y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    
    public Punto calcularPuntoMasCercano(Punto[] otrosPuntos) {
        Punto _masCercanoPunto = null;
        double minDistancia = Double.MAX_VALUE;
        double actualDistancia;
        
        for(int i=0; i < otrosPuntos.length; i++) {
            actualDistancia = this.getDistance(otrosPuntos[i]);
            if (actualDistancia <= minDistancia) {
                minDistancia = actualDistancia;
                _masCercanoPunto = otrosPuntos[i];
                       
            }
        }
        return _masCercanoPunto;
    }
    
}
