class TraduccionIngles implements Traduccion {
    public void introducirDistancia() {
        System.out.print("Enter the distance travelled in meters: ");
    }
    public void introducirTiempo() {
        System.out.print("Enter the time in seconds: ");
    }
    public void inicioRespuesta() {
        System.out.println("The average velocity is ");
    }
    public void finRespuesta() {
        System.out.println(" meters per second.");
    }
}