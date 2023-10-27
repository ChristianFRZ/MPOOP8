/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * La clase InstrumentoViento es una clase concreta 
 * que implementa la interfaz InstrumentoMusical. 
 * La clase InstrumentoViento representa cualquier 
 * instrumento musical que produzca sonido al soplar 
 * aire a través de un tubo. 
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {
    
    /**
     * Constructor vacio
     */
    public InstrumentoViento() {
    }
    
    /**
     * Método tipoInstrumneto()
     * @return  Devuelve el tipo de instrumento de viento
     */
    public String tipoInstrumento(){
    return "instrumentoViento";
    }
    
    /**
     * Método sobreescito que representa que se toca el instrumento de viento
     */
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento");
    }
    
    /**
     * Método sobreescrito que representa que se aina el instrumento de viento
     */
    @Override
    public void afinar() {
        System.out.println("Afinando instrumento");
    }
    
    /**
     * Método sobreescrito tipoInstrumneto()
     * @return devuelve null
     * Esto se debe a que la clase InstrumentoViento
     * es una clase abstracta que representa todos los 
     * instrumentos de viento, y no un tipo de instrumento
     * de viento específico. Las clases concretas que 
     * heredan de la clase InstrumentoViento deben
     * implementar el método tipoInstrumneto() para 
     * devolver el tipo de instrumento de viento 
     * específico que representan.
     */
    @Override
    public String tipoInstrumneto() {
        return null;
    }
    
}
