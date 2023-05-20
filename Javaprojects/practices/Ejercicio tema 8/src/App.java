public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();
        persona.setEdad(20);
        int edad = persona.getEdad();
        System.out.println(" La persona tiene " + edad + " años ");
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
    
    public int getEdad(){
        return this.edad;
    }
   
}