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
public class Circulo extends FiguraGeometrica implements Shape{
    private Punto punto;
    private int radio;

    public Circulo(Punto punto, int radio, String name) {
        super(name);
        this.punto = punto;
        this.radio = radio;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double calcularArea(){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public boolean  esRegular(){
        return true;
    }

    @Override
    public String toString() {
        return "Circulo{" + "nombre=" + getNombre() + "punto=" + punto + ", radio=" + radio + '}';
    }

    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * getRadio();
    }
    
    
    
}
