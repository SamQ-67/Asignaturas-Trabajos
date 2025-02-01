package Practica1.pkg1;

/**
 *
 * @author ririo
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear un objeto
        //instanciar
        //identificador para guerdar la direccion en memoria
        //variable de un tipo de dato abstracto
        Persona perso1;
        //asignamos memoria
        perso1 = new Persona();
        //creamos un objeto de tipo persona
        perso1.edad = 10;
        perso1.genero = "H";
        perso1.nombre = "Samuel";
        perso1.imprimirDatos();
        System.out.println(perso1);
        //JAVa
        //No accedemos a direcciones reales de memoria (RAM)
        //A las direcciones de memoria (falsas) se les llama
        //REFERENCIAS.
        //APUNTADOR > Variable que almacena una direccion (REAL)
    }
}

class Persona {
    //Datos - estado - ATRIBUTOS
    String nombre;
    int edad;
    String genero;
    //Comportamiento
    void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }
}
