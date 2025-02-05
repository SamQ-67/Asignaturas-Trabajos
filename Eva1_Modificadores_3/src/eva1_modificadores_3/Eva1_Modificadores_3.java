/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_modificadores_3;

/**
 *
 * @author ririo
 */
public class Eva1_Modificadores_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //INSTAnCIAR UN OBJETO
        //CLASE IDENTIFICADOR = new CONSTRUCTOR (PARAMETROS);
        Persona perso = new Persona();
        perso.setNombre("Samuel");
        perso.setApellidos("Quezada Miranda");
        perso.setEdad(19);
        perso.setGenero("Masculino");
        perso.setCurp("DSDS55SDSds");
        System.out.println("Nombre: " + perso.getNombre());
        System.out.println("Apellidos: " + perso.getApellidos());
        System.out.println("Edad: " + perso.getEdad());
        System.out.println("Genero: " + perso.getGenero());
        System.out.println("CURP: " + perso.getCurp());
    }
    
}
