import java.time.LocalDate;

abstract class CicloAlquiler {
    protected double autonomia;
    protected double alturaMinima;
    protected String marca;
    protected String modelo;
    protected LocalDate fechaCompra;

    public CicloAlquiler(String marca, String modelo, LocalDate fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
        this.autonomia = autonomia;
        this.alturaMinima = alturaMinima;
    }

    public abstract double getTarifaAlquiler();

    public void mostrarInfo() {

        System.out.println("Marca: " + marca + " Modelo: " + modelo + " Fecha de compra: " + fechaCompra + " Tarifa de alquiler: " + getTarifaAlquiler() + "€"
                + " Autonomía: " + autonomia + " Altura mínima: " + alturaMinima);
    }
}