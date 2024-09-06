/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Cabezas
 */
public class SuperficiePlana {
    
    private List<FiguraGeometrica> figurasGeometricas;

    public SuperficiePlana() {
        this.figurasGeometricas = new ArrayList<>();
    }

    public void agregarFigura(FiguraGeometrica figura) {
        if (figura != null) {
            figurasGeometricas.add(figura);
        }
    }

    public void eliminarFigura(FiguraGeometrica figura) {
        figurasGeometricas.remove(figura);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Superficie Plana con figuras geométricas:\n");
        for (FiguraGeometrica figura : figurasGeometricas) {
            sb.append(figura.toString()).append("\n");
        }
        return sb.toString();
    }
    
}
