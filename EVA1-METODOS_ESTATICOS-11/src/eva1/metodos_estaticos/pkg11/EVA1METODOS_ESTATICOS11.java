/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1.metodos_estaticos.pkg11;

/**
 *
 * @author ririo
 */
public class EVA1METODOS_ESTATICOS11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Math es una clase que proporciona funciones matematicas
        //Math.
        double valorAleatorio = Math.random();
        int valor = (int)(valorAleatorio * 1000);
        System.out.println(valorAleatorio);
        System.out.println(valor);
        //
        //Math math = new Math();
        Persona perso = new Persona();
        perso.mostrarMensaje();
        //USAR FORMULAS DE TEMPERSTURA
        //Temperaturas tempe = new Temperaturas();
        //System.out.println(tempe.convertirFaC(100));
        System.out.println(Temperaturas.convertirFaC(100));
        System.out.println(Temperaturas.convertirCaF(100));
        System.out.println(Temperaturas.convertirCaK(100));
        System.out.println(Temperaturas.convertirKaC(100));
        System.out.println(Temperaturas.convertirFaK(100));
        System.out.println(Temperaturas.convertirKaF(100));
    }
    
}


class Persona{
    int valor;
    public void mostrarMensaje(){
        System.out.println("Hola mundo!!!");
    }
}