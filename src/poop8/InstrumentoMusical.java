/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poop8;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * La interfaz InstrumentoMusical define el comportamiento 
 * común de todos los instrumentos musicales
 */
public interface InstrumentoMusical {
    /**
     * Método tocar()
     * Toca el instrumento musical
     */
    void tocar();
    
    /**
     * Método afinar()
     * Afina el instrumento musical
     */
    void afinar();
    
    /**
     * Método tipoInstrumento()
     * @return  Devuelve el tipo de instrumento musical
     */
    String tipoInstrumneto();
}
