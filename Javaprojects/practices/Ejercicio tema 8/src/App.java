public class App {

    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();
        /*
         * En este caso con set establecemos los valores a las variables de la clase y
         * con get obtenemos los valores
         */
        persona.setEdad(20);
        // asiganamos a edad el valor de la edad de la clase al igual que el resto de
        // propiedades
        int edad = persona.getEdad();

        persona.setNombre("Pablo Ramos");
        String nombre = persona.getNombre();

        persona.setTelefono("123456");
        String telefono = persona.getTelefono();

        System.out.println("La persona se llama " + nombre);
        System.out.println("Tiene " + edad + " años ");
        System.out.println("Su numero de telefono es " + telefono + " \n");




    }
}

// Las clases publicas pueden ser usadas fuera de las clases en cambio las
// privadas son exclusivas de la clase como tal y hay que usar getters o setters para usar las funciones
class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    // FIja el valor
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // La funcion permite al ser llamadas obtener el valor
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
