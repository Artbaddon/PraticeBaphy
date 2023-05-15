public class App {
    public static void main(String[] args) throws Exception {

        // Ejercicio IF
        int numeroif = -5;
        System.out.println("Numero IF");
        if (numeroif > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroif < 0) {
            System.out.println("El numero es negativo");
        }

        // Ejercicio Bucle While
        int numerowhile = -3;
        System.out.println("Bucle while");
        while (numerowhile < 3) {
            System.out.println("el numero es: " + numerowhile);
            numerowhile++;
        }
        System.out.println("Bucle DO while");

        // Ejercicio Bucle Do While
        do {
            System.out.println("el numero es: " + numerowhile);
            numerowhile++;

        } while (numerowhile < -2);
        System.out.println("Bucle for");

        // Ejercicio Bucle For
        for (int numerofor = 0; numerofor <= 3; numerofor++) {
            System.out.println("El numero es: " + numerofor);
        }
        System.out.println("Switch case");
        String estacion = "verano";

        // Ejercicio Switch Case
        switch (estacion) {
            case "otoño":
                System.out.println("Es otoño clima templado");
                break;
            case "verano":
                System.out.println("Es verano hace calor");
                break;
            case "invierno":
                System.out.println("Es invierno hace frio");
                break;
            case "primavera":
                System.out.println("Es primavera hay buen clima");
                break;
            default:
                System.out.println("Eliga una estacion que exista ");
        }
    }
}
