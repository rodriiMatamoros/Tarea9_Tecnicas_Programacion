import  java.time.LocalDate;

public class AlquilerBicicletas {
    public static void mostrarInfo() {
        CicloAlquiler[] ciclos = new CicloAlquiler[6];
        ciclos[0] = new Bicicleta("Lapierre", "speed 400", LocalDate.of(2022, 3, 1), 27);
        ciclos[1] = new Bicicleta("Btwin", "riverside 900", LocalDate.of(2023, 1, 1), 10);
        ciclos[2] = new Giroscopio("Segway", "Nine", LocalDate.of(2023, 2, 1), 40);
        ciclos[3] = new Giroscopio("Weebot", "Echo", LocalDate.of(2022, 1, 1), 35);
        ciclos[4] = new Segway("Immotion", "v8", LocalDate.of(2023, 3, 1), 40, 150);
        ciclos[5] = new Segway("Segway", "Ninebot One E+", LocalDate.of(2022, 2, 1), 40, 150);

        for (CicloAlquiler ciclo : ciclos) {
            ciclo.mostrarInfo();
        }
    }
}


