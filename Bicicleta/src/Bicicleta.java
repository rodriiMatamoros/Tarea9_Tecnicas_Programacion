import java.time.LocalDate;

class Bicicleta extends CicloAlquiler {
    private int numVelocidades;

    public Bicicleta(String marca, String modelo, LocalDate fechaCompra, int numVelocidades) {
        super(marca, modelo, fechaCompra);
        this.numVelocidades = numVelocidades;
    }

    public double getTarifaAlquiler() {
        return 4.90;
    }
}
