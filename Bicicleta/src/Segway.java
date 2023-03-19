import java.time.LocalDate;

class Segway extends CicloAlquiler {
    private double autonomia;
    private double alturaMinima;

    public Segway(String marca, String modelo, LocalDate fechaCompra, double autonomia, double alturaMinima) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
        this.alturaMinima = alturaMinima;
    }

    public double getTarifaAlquiler() {
        return 18.90;
    }
}
