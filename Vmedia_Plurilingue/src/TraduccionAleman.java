class TraduccionAleman implements Traduccion {
    public void introducirDistancia() {
        System.out.print("Geben Sie die zurückgelegte Distanz in Metern ein: ");
    }
    public void introducirTiempo() {
        System.out.print("Geben Sie die Zeit in Sekunden ein:");
    }
    public void inicioRespuesta() {
        System.out.println("Die durchschnittliche Geschwindigkeit beträgt");
    }
    public void finRespuesta() {
        System.out.println("Meter pro Sekunde.");
    }
}