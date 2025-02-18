/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1.pkgthis.pkg10;

/**
 *
 * @author ririo
 */
public class EVA1THIS10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona("Sam", "Que", 19);
        Laptop lap = new Laptop("AMD Ryzen 5 5500U", 1.5, 275, 11.5, "HP", "Series X");
        lap.Mostrar_Lap();
        perso.Mostrar();
    }
    
}
