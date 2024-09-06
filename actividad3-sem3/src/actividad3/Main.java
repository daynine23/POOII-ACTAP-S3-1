/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

/**
 *
 * @author USUARIO
 */
public class Main {
    
    public static void main(String[] args) {
	// write your code here
        
        System.out.println("----------------- TRIANGULO ------------------");
        
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 0);
        Punto p3 = new Punto(3, 4);

        Triangulo triangulo = new Triangulo(p1, p2, p3);
        SuperficiePlana superficieT = new SuperficiePlana();
        superficieT.agregarFigura(triangulo);

        System.out.println("El área del triángulo es: " + triangulo.calcularAreaFigura());
        System.out.println("La figura geometrica es: " + triangulo.getNombre());
        System.out.println("El perimetro del Triangulo es: " + triangulo.obtenerPerimetro());
        System.out.println("Los vertices del triangulo son: " + "P1 = (" + String.valueOf(p1.getX()) + "," + String.valueOf(p1.getY()) +")" + 
                                                                " P2 = (" + String.valueOf(p2.getX()) + "," + String.valueOf(p2.getY()) +")" +
                                                                " P3 = (" + String.valueOf(p3.getX()) + "," + String.valueOf(p3.getY()) +")"                                 
                                                                );
        System.out.println("Es un triángulo regular? " + (triangulo.esRegular() ? "Sí" : "No"));

        
        System.out.println("----------------- CIRCULO ------------------");
        
        Punto pc1 = new Punto(0, 0);
        
        Circulo circulo = new Circulo(pc1, 5, "Circulo");
        SuperficiePlana superficieC = new SuperficiePlana();
        superficieC.agregarFigura(circulo);
        
        System.out.println("El área del circulo es: " + circulo.calcularArea());
        System.out.println("La figura geometrica es: " + circulo.getNombre());
        System.out.println("El perimetro del circulo es: " + circulo.obtenerPerimetro());
        System.out.println("El punto del circulo es: " + "P1 = (" + String.valueOf(pc1.getX()) + "," + String.valueOf(pc1.getY()) +")"                               
                                                                );
        System.out.println("Es un circulo regular? " + (circulo.esRegular() ? "Sí" : "No"));
        
        System.out.println("----------------- RECTANGULO ------------------");
        
        
        Punto pr1 = new Punto(0, 0);
        Punto pr2 = new Punto(5, 0);
        Punto pr3 = new Punto(10, 5);
        Punto pr4 = new Punto(0, 10);

        Rectangulo rectangulo = new Rectangulo(pr1, pr2, pr3, pr4, "Rectangulo");
        SuperficiePlana superficieR = new SuperficiePlana();
        superficieR.agregarFigura(rectangulo);

        System.out.println("El área del rectangulo es: " + rectangulo.calcularArea(pr1, pr2, pr3, pr4));
        System.out.println("La figura geometrica es: " + rectangulo.getNombre());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.obtenerPerimetro());
        System.out.println("Los vertices del rectangulo son: " + "P1 = (" + String.valueOf(pr1.getX()) + "," + String.valueOf(pr1.getY()) +")" + 
                                                                " P2 = (" + String.valueOf(pr2.getX()) + "," + String.valueOf(pr2.getY()) +")" +
                                                                " P3 = (" + String.valueOf(pr3.getX()) + "," + String.valueOf(pr3.getY()) +")" +
                                                                " P4 = (" + String.valueOf(pr4.getX()) + "," + String.valueOf(pr4.getY()) +")"   
                                                                );
        System.out.println("Es un rectangulo regular? " + (rectangulo.esRegular() ? "Sí" : "No"));
        
    }
    
}
