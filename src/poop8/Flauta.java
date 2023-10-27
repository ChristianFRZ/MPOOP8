/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * La clase Flauta es una clase concreta que
 * hereda de la clase abstracta InstrumentoViento 
 * y representa una flauta. 
 */
public class Flauta extends InstrumentoViento {
    
    /**
     * Método sobreescrito tipoInstrumneto()
     * @return Devuelve el tipo de instrumento de viento, que en este caso es "Flauta"
     */
    @Override
    public String tipoInstrumneto() {
        return "Flauta";                            // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    /**
     * Método toString sobrescrito que muestra los valores de la flauta
     * @return returna una concatenación de los valores de la flauta
     */
    @Override
    public String toString() {
        return "Flauta{"+'}';
    }
}
