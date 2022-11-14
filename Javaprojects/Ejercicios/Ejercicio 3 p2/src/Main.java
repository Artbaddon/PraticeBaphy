public class Main {

    public static void suma(int a, int b, int c){

        suma(20, 40, 60);
        int resultado;
        resultado = a + b + c;
        System.out.println("el resultado de la suma es de:" + resultado );

    }


    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.DarPuerta();
        System.out.println("El numero de puertas es de:" + miCoche.puertas);
    }

}

class Coche{
    public int puertas = 4;

    public void DarPuerta () {
        this.puertas++;
    }
}