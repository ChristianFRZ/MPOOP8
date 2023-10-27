/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Se crea dos objetos Poligono: 
         * un objeto Triangulo y un objeto Cuadrilatero
         */
        Poligono poligono;
        Triangulo triangulo = new Triangulo();
        Cuadrilatero cuadrilatero=new Cuadrilatero();
        System.out.println(triangulo);
        System.out.println(cuadrilatero);
        /**
         * Inicializando valores de base y altura para el triangulo y cuadrilatero
         */
        triangulo.setBase(78);
        triangulo.setAlt(2);
        
        cuadrilatero.setBase(4);
        cuadrilatero.setAlt(9);
        
        /**
         * Se imprimen los atributos y el área, del triangulo y cuadrilatero
         */
        System.out.println(triangulo);
        System.out.println(cuadrilatero);
        System.out.println(triangulo.area());
        System.out.println(cuadrilatero.area());
        
        poligono =new Triangulo();
        System.out.println(poligono);
        
        //System.out.println(poligono.getBase());
        /**
         * Método getPoligono() para identificar el tipo de cada objeto Poligono
         */
        getPoligono(poligono);
        poligono =new Cuadrilatero();
        getPoligono(poligono);
        
        /**
         * Se crea un objeto Flauta e imprime el tipo de instrumento que representa
         */
        Flauta flauta = new Flauta();
        System.out.println(flauta.tipoInstrumento());
        
        /**
         *  Se imprime el valor de la constante PI y el nombre del mes de diciembre
         */
        System.out.println(Math.PI);
        System.out.println(Meses.NOMBRE_MESES[Meses.DOCE]);
    }
    /**
     * Método getPoligono() que utiliza el operador instanceof
     * para verificar si el objeto Poligono pasado como 
     * argumento es una instancia de la clase Triangulo 
     * o de la clase Cuadrilatero
     * @param poligono 
     */
    private static void getPoligono(Poligono poligono) {
        if(poligono instanceof Triangulo){
            System.out.println("Es un traingulo");
        }else if(poligono instanceof Cuadrilatero){
            System.out.println("Es un caudrilatero");
        }else{
            System.out.println("Es un poligono");
        }
    }
    
}
