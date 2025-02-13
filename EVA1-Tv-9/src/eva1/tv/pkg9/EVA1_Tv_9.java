/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1.tv.pkg9;

/**
 *
 * @author ririo
 */
public class EVA1_Tv_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tv_Clase Tv = new Tv_Clase();
        Tv.imprimirDatos();
        Tv.encenderApagar();//BOTON DE ENCENDIDO DEL CONTROL
        Tv.subirVolumen();
        Tv.masCanal();
        Tv.imprimirDatos();
    }
    
}
