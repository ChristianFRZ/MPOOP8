/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poop8;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * La interfaz Meses define los valores y nombres de los meses del año
 */
public interface Meses {
    /**
     * Atributos constantes UNO, DOS, ..., DOCE
     * UNO: El número del mes de enero
     * DOS: El número del mes de febrero
     * TRES: El número del mes de marzo
     * CUATRO: El número del mes de abril
     * CINCO: El número del mes de mayo
     * SEIS: El número del mes de junio
     * SIETE: El número del mes de julio
     * OCHO: El número del mes de agosto
     * NUEVE: El número del mes de septiembre
     * DIEZ: El número del mes de octubre
     * ONCE: El número del mes de noviembre
     * DOCE: El número del mes de diciembre
     */
    int UNO=1,DOS=2,TRES=3,CUATRO=4,
            CINCO=5,SEIS=6,SIETE=7,OCHO=8,
            NUEVE=9,DIEZ=10,ONCE=11,DOCE=12;
    
    /**
     * Atributo NOMBRE_MESES[]
     * Es un arreglo de strings que contiene
     * los nombres de los meses
     * El índice del arreglo corresponde al número del mes
     */
    String[]NOMBRE_MESES={"","ENERO","FEBRERO",
        "MARZO","ABRIL","MAYO","JUNIO","JULIO",
        "AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE",
        "DICIEMBRE"};
}
