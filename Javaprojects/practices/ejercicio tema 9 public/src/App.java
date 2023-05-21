public class App {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();
        persona.nombre("Jaime");
        persona.edad(14);
        persona.telefono("13145");

        System.out.println("La persona se llama " + persona.nombre + "\n tiene " +persona.edad +" y.o \n "+ "su telefono es: " + persona.telefono+"\n");
       



    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

    public void edad(int edad) {
        this.edad = edad;

    }

    public void nombre(String nombre) {
        this.nombre = nombre;
    }

    public void telefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {

    int credito;

    public void credito(int credito) {
        this.credito = credito;

    }
}

class Trabajador extends Persona {
    int salario;

    public void salario(int salario) {
        this.salario = salario;
    }
}
