public class App {
    public static void main(String[] args) throws Exception {
        Moto moto = new Moto(2, "azul", 10.5);
        System.out.println("velocidad actual " + moto.velocidadActual + " Numero de ruedas: " + moto.numeroDeRuedas
                + " color chasis " + moto.colorChasis);
        moto.acelerar(25.5);
        moto.agregarRueda();
        System.out.println("velocidad actual " + moto.velocidadActual + " Numero de ruedas: " + moto.numeroDeRuedas
                + " color chasis " + moto.colorChasis);

    }
}

class Moto {
    // Se crea una clase moto la cual tiene unos atributos
    int numeroDeRuedas;
    double velocidadActual;
    String colorChasis;

    // Se crea un contructor el cual se inicia justo al llamar a la clase en este
    // caso se piden 3 valores
    public Moto(int numeroDeRuedas, String colorChasis, double velocidadActual) {
        // Se utiliza el this para referirse a las variables de la clase y no a las
        // variables del constructor.
        this.numeroDeRuedas = numeroDeRuedas;
        this.colorChasis = colorChasis;

        System.out.println("Estoy en el constructor");
    }

    // Esto lo que hace es crear una funcion para modificar los atributos al ser llamadas
    
    public void acelerar(Double km) {
        velocidadActual += km;
    }

    public void agregarRueda() {
        numeroDeRuedas += 1;
    }
}