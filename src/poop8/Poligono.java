/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * La clase Poligono es una clase abstracta que representa 
 * cualquier figura geométrica cerrada formada por tres o más segmentos
 * de línea rectas.
 */
public abstract class Poligono extends Object{
    /**
     * Constructor vacio
     */
    public Poligono(){
        
    }
    
    /**
     * Calcula el area de un polígono
     * @return el area del poligono
     */
    public abstract int area();
    
    /**
     * Calcula el perímetro del polígono.
     * @return el perimetro del poligono
     */
    public abstract int perimetro();
    
    /**
     * Método toString sobrescrito 
     * @return returna una representación en cadena del polígono
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
