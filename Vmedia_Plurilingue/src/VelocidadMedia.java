import java.util.Scanner;

public class VelocidadMedia {
    public static void mostrarInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Seleccione el idioma \n  1.--> Italiano \n  2.--> Inglés \n  3.--> Francés \n  4.--> Aleman \n  5.--> Español \n  6.--> Gallego \n  7.--> Catalán \n");
        int idioma = sc.nextInt();
        Traduccion traduccion;
        if (idioma == 1) {
            traduccion = new TraduccionItaliano();
        } else if (idioma == 2) {
            traduccion = new TraduccionIngles();
        } else if (idioma == 3) {
            traduccion = new TraduccionFrances();
        } else if (idioma == 4) {
            traduccion = new TraduccionAleman();
        } else if (idioma == 5) {
            traduccion = new TraduccionEspanol();
        } else if (idioma == 6) {
            traduccion = new TraduccionGalego();
        } else if (idioma == 7) {
            traduccion = new TraduccionCatalan();
        } else {
            System.out.println("Idioma no válido");
            return;
        }
        traduccion.introducirDistancia();
        double distancia = sc.nextDouble();
        traduccion.introducirTiempo();
        double tiempo = sc.nextDouble();
        double velocidad = distancia / tiempo;
        traduccion.inicioRespuesta();
        System.out.printf("%.2f", velocidad);
        traduccion.finRespuesta();
    }
}
