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
public abstract class Cuadrilatero extends FiguraGeometrica {
    
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;
    private Punto vertice4;

    public Cuadrilatero(Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4, String nombre) {
        super(nombre);
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
        this.vertice4 = vertice4;
    }

    public Punto getVertice1() {
        return vertice1;
    }

    public void setVertice1(Punto vertice1) {
        this.vertice1 = vertice1;
    }

    public Punto getVertice2() {
        return vertice2;
    }

    public void setVertice2(Punto vertice2) {
        this.vertice2 = vertice2;
    }

    public Punto getVertice3() {
        return vertice3;
    }

    public void setVertice3(Punto vertice3) {
        this.vertice3 = vertice3;
    }

    public Punto getVertice4() {
        return vertice4;
    }

    public void setVertice4(Punto vertice4) {
        this.vertice4 = vertice4;
    }
    
    public boolean esRegular() {
        double d1 = vertice1.getDistance(vertice2);
        double d2 = vertice2.getDistance(vertice3);
        double d3 = vertice3.getDistance(vertice4);
        double d4 = vertice4.getDistance(vertice1);
        return d1 == d2 && d3 == d4;
    }

    @Override
    public String toString() {
        return "Cuadrilatero{" + "nombre =" + getNombre() + "vertice1=" + vertice1 + ", vertice2=" + vertice2 + ", vertice3=" + vertice3 + ", vertice4=" + vertice4 + '}';
    }
    
    
}
