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
public class Rectangulo extends Cuadrilatero implements Shape{

    public Rectangulo(Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4, String nombre) {
        super(vertice1, vertice2, vertice3, vertice4, nombre);
        
        // Verificación de cuadrilátero regular
    if (!esCuadrilateroRegular(vertice1, vertice2, vertice3, vertice4)) {
        System.out.println("El rectángulo no es un cuadrilátero regular.");
    }
    }
    
    
    
    public double calcularArea(Punto v1, Punto v2, Punto v3, Punto v4) {
    double b = v1.getDistance(v2);
    double h = v1.getDistance(v4);
    return b * h;
    }
    
    @Override
    public String toString() {
        return "Rectángulo: " + getNombre();
    }
    
    private boolean esCuadrilateroRegular(Punto v1, Punto v2, Punto v3, Punto v4) {
    // Verificar si los lados opuestos son iguales
    double lado1 = v1.getDistance(v2);
    double lado2 = v2.getDistance(v3);
    double lado3 = v3.getDistance(v4);
    double lado4 = v4.getDistance(v1);
    
    return lado1 == lado3 && lado2 == lado4;
    }
    
    private boolean checkRectangulo(Punto v1, Punto v2, Punto v3, Punto v4){
        Punto auxVert = v1.calcularPuntoMasCercano(new Punto[]{v2, v3, v4});
        if (auxVert.equals(v2)){
            return v1.getDistance(v3) == v2.getDistance(v4)
                  && v1.getDistance(v4) == v2.getDistance(v3)
                  && escalarProducto(v1,auxVert,v1.calcularPuntoMasCercano(new Punto[]{v3,v4}));
        } else if (auxVert.equals(v3)){
            return v1.getDistance(v2) == v2.getDistance(v4)
                  && v1.getDistance(v4) == v2.getDistance(v2)
                  && escalarProducto(v1,auxVert,v1.calcularPuntoMasCercano(new Punto[]{v2,v4}));
        } else if (auxVert.equals(v4)){
            return v1.getDistance(v2) == v4.getDistance(v3)
                  && v1.getDistance(v3) == v2.getDistance(v2)
                  && escalarProducto(v1,auxVert,v1.calcularPuntoMasCercano(new Punto[]{v2,v3}));
        } else {
            return false;
        }
    }
    
    private boolean escalarProducto(Punto p1, Punto p2, Punto p3){
        return(p3.getY()-p1.getY()) * (p2.getY()-p1.getY()) + (p3.getX()-p1.getX()) * (p2.getX()-p1.getX()) == 0;
    }

    @Override
    public double obtenerPerimetro() {
        double base = getVertice1().getDistance(getVertice2());
        double altura = getVertice4().getDistance(getVertice1());
        return 2 * (base + altura);
    }
    
}
