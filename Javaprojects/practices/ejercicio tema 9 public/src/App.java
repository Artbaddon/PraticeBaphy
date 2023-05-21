public class App {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();
        persona.nombre("Jaime Buckingham");
        persona.edad(14);
        persona.telefono("13145");

        System.out.println("La persona se llama " + persona.nombre + "\ntiene " + persona.edad + " y.o \n"
                + "su telefono es: " + persona.telefono + "\n");

        Cliente cliente = new Cliente();
        cliente.nombre("Maria Sedai");
        cliente.edad(50);
        cliente.telefono("6666666");
        cliente.credito(4141);
        System.out.println("La persona se llama " + cliente.nombre + "\ntiene " + cliente.edad + " y.o \n"
        + "su telefono es: " + cliente.telefono + "\n" + "Su credito es : " + cliente.credito + "\n");

        Trabajador trabajador = new Trabajador();
        trabajador.nombre("Rand Al Thor");
        trabajador.edad(34);
        trabajador.telefono("6666666");
        trabajador.salario(4141);
        System.out.println("El persona se llama " + trabajador.nombre + "\ntiene " + trabajador.edad + " y.o\n"
        + "su telefono es: " + trabajador.telefono + "\n" + "Su credito es : " + trabajador.salario + "\n");

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
