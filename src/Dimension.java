public class Dimension {
    private double ancho;
    private double altura;
    private double profundidad;

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    Dimension(double ancho, double altura, double profundidad) {
        setAltura(altura);
        setAncho(ancho);
        setProfundidad(profundidad);
    }
}
