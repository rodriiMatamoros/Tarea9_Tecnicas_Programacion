import java.time.LocalDate;

class Giroscopio extends CicloAlquiler {
    private double autonomia;

    public Giroscopio(String marca, String modelo, LocalDate fechaCompra, double autonomia) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
    }

    public double getTarifaAlquiler() {
        return 29.90;
    }
}