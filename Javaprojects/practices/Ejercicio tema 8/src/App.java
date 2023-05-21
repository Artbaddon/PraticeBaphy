public class App {
   
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();
         /* En este caso con set establecemos los valores a las variables de la clase y con get obtenemos los valores*/
        persona.setEdad(20);
        // asiganamos a edad el valor de la edad de la clase al igual que el resto de propiedades
        int edad = persona.getEdad();

        persona.setNombre("Pablo Ramos");
        String nombre = persona.getNombre();

        persona.setTelefono("123456");
        String telefono = persona.getTelefono();

        System.out.println(" La persona se llama " + nombre);
        System.out.println("Tiene " + edad + " años ");
        System.out.println("Su numero de telefono es " + telefono);

        // La clase cliente 
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan Marquez");
        cliente.setEdad(35);
        cliente.setTelefono("3333333");
        cliente.setCredito(123555);
        System.out.println("El Cliente se llama " + cliente.getCredito());
        System.out.println("Tiene " + cliente.getEdad() + " años ");
        System.out.println("Su numero de telefono es " + cliente.getTelefono());
        System.out.println("El credito del cliente es:  " + cliente.getCredito());

        
    }
}

// Las clases publicas pueden ser usadas fuera de las clases en cambio las
// privadas son exclusivas de la clase como tal
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

class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    
}