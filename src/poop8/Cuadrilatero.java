/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * La clase Cuadrilatero es una clase concreta 
 * que hereda de la clase abstracta Poligono y
 * representa un cuadrilátero
 * 
 */
public class Cuadrilatero extends Poligono{
    /**
     * Atributos:
     * alfa, beta y gamma: Los ángulos interiores del cuadrilátero en grados
     * a y b: Las longitudes de los lados paralelos del cuadrilátero
     * base y alt: La base y la altura del cuadrilátero, respectivamente
     */
    private int alfa,beta,gamma,a,b,base,alt;
    
    /**
     * Constructor vacio
     */
    public Cuadrilatero() {
    }
    
    /**
     * Constructor lleno
     * @param alfa un ángulo interior del cuadrilatero
     * @param beta un ángulo interior del cuadrilatero
     * @param gamma un ángulo interior del cuadrilatero
     * @param a un lado del cuadrilatero
     * @param b un lado del cuadrilatero
     * @param base base del cuadrilatero
     * @param alt altura del cuadrilatero
     */
    public Cuadrilatero(int alfa, int beta,
            int gamma, int a, int b, int base, 
            int alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.base = base;
        this.alt = alt;
    }

     /**
     * Método getAlfa
     * @return Devuelve el valor del ángulo alfa
     */
    public int getAlfa() {
        return alfa;
    }
    
    /**
     *  Establece el valor del ángulo alfa
     * @param alfa 
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }
    
    /**
     * Método getBeta()
     * @return Devuelve el valor del ángulo beta
     */
    public int getBeta() {
        return beta;
    }
    
    /**
     * Establece el valor del ángulo beta
     * @param beta 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    
    /**
     * Métood getGamma
     * @return Devuelve el valor del ángulo gamma
     */
    public int getGamma() {
        return gamma;
    }
    
    /**
     * Establece el valor del ángulo gamma
     * @param gamma 
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }
    
    /**
     * Método getA
     * @return Devuelve la longitud del lado a
     */
    public float getA() {
        return a;
    }
    
    /**
     * Establece la longitud del lado a
     * @param a 
     */
    public void setA(int a) {
        this.a = a;
    }
    
    /**
     * Método getB
     * @return Devuelve la longitud del lado b
     */
    public float getB() {
        return b;
    }
    
    /**
     * Establece la longitud del lado b
     * @param b 
     */
    public void setB(int b) {
        this.b = b;
    }
    
    
    /**
     * Método getBase
     * @return  Devuelve la base del cuadrilatero
     */
    public float getBase() {
        return base;
    }
    
    /**
     * Establece la base del cuadrilatero
     * @param base 
     */
    public void setBase(int base) {
        this.base = base;
    }
    
    /**
     * Método getAlt
     * @return Devuelve la altura del cuadrilatero
     */
    public float getAlt() {
        return alt;
    }
    
    /**
     * Establece la altura del cuadrilatero
     * @param alt 
     */
    public void setAlt(int alt) {
        this.alt = alt;
    }
    
    /**
     * Método sobreescrito que calcula el area del cuadrilatero
     * @return devuelve el area del cuadrilatero 
     */
    @Override
    public int area(){
        return (int)(base*alt);
    }
    
    /**
     * Método sobreescrito que calcula el perimetro del cuadrilatero
     * @return devuelve el perimetro del cuadrilatero 
     */
    @Override
    public int perimetro(){
        return (int)(2*a+2*b);
    }
    
    /**
     * Método toString sobrescrito que muestra los valores de los atributos
     * @return returna una concatenación de los valores de los atributos del cuadrilatero y los que heredo 
     */
    @Override
    public String toString() {
        return super.toString()
                +"Cuadrilatero{" + "alfa=" 
                + alfa + ", beta=" + beta 
                + ", gamma=" + gamma + ", a=" + a 
                + ", b=" + b + ", base=" + base 
                + ", alt=" + alt + '}';
    }
}
