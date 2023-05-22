
public class Clase_String_Metodos {

    public static void main(String[] args) {

        String nombre="Monkey D PERRO GP";

        System.out.println("Mi nombre es " + nombre);

        System.out.println("Mi nombre tiene un total de " + nombre.length() + " caracteres");

        System.out.println("La primera letra de  "+ nombre +" es la " + nombre.charAt(0));

        int lasto_letra;
        lasto_letra=nombre.length();

        System.out.println("Y la ultima letra es la " + nombre.charAt(lasto_letra-1));

    }
}
