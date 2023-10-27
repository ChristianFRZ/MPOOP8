/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * La clase Triangulo es una clase concreta 
 * que hereda de la clase abstracta Poligono 
 * y representa un triángulo.
 * 
 */
public class Triangulo extends Poligono{
    /**
     * Atributos: 
     * alfa, beta, gamma: representan los angulos interiores del triangulo
     * a,b,c: representan los lados del triángulo 
     * base, alt: representan la base y la altura del triángulo, respectivamente
     */
    private int alfa,beta,gamma;
    private float a,b,c,base,alt;
    
    /**
     * Constructor vacio
     */
    public Triangulo() {
    }
    
    /**
     * Constructor lleno
     * @param alfa un ángulo interior del triángulo
     * @param beta un ángulo interior del triángulo
     * @param gamma un ángulo interior del triángulo
     * @param a un lado del triangulo
     * @param b un lado del triangulo
     * @param c un lado del triangulo
     * @param base base del triangulo
     * @param alt altura del triangulo
     */
    public Triangulo(int alfa, int beta, int gamma,
            float a, float b, float c, float base,
            float alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
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
    public void setA(float a) {
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
    public void setB(float b) {
        this.b = b;
    }
    
    /**
     * Método getC
     * @return Devuelve la longitud del lado c
     */
    public float getC() {
        return c;
    }
    
    /**
     * Establece la longitud del lado a
     * @param c
     */
    public void setC(float c) {
        this.c = c;
    }
    
    /**
     * Método getBase
     * @return  Devuelve la base del triángulo
     */
    public float getBase() {
        return base;
    }
    
    /**
     * Establece la base del triángulo
     * @param base 
     */
    public void setBase(float base) {
        this.base = base;
    }
    
    /**
     * Método getAlt
     * @return Devuelve la altura del triángulo
     */
    public float getAlt() {
        return alt;
    }
    
    /**
     * Establece la altura del triángul
     * @param alt 
     */
    public void setAlt(float alt) {
        this.alt = alt;
    }
    
    /**
     * Método sobreescrito que calcula el área del triángulo
     * @return devuelve el area del triangulo
     */
    @Override
    public int area(){
        return (int)(base*alt)/2;
    }
    
    /**
     * Método sobreescrito que calcula el perimetro del triángulo
     * @return devuelve el perimetro del triangulo 
     */
    @Override
    public int perimetro(){
        return (int)(a+b+c);
    }
    
    /**
     * Método toString sobrescrito que muestra los valores de los atributos
     * @return returna una concatenación de los valores de los atributos del triangulo y los que heredo 
     */
    @Override
    public String toString() {
        return super.toString()+ 
                "Triangulo{" + "alfa=" + alfa
                + ", beta=" + beta 
                + ", gamma=" + gamma 
                + ", a=" + a + ", b=" + b
                + ", c=" + c + ", base=" + base 
                + ", alt=" + alt + '}';
    }
    
}