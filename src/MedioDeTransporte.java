import java.util.ArrayList;

public class MedioDeTransporte {
    private double capacidad;
    private double capacidadMaxima;
    private Dimension dimension;
    private ArrayList<ObjetoTransportable> objetoTransportables;

    MedioDeTransporte(double capacidadMaxima, Dimension dimension) {
        setCapacidadMaxima(capacidadMaxima);
        setDimension(dimension);
        setCapacidad(0);
        setObjetoTransportables(new ArrayList<ObjetoTransportable>());
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public ArrayList<ObjetoTransportable> getObjetoTransportables() {
        return objetoTransportables;
    }

    public void setObjetoTransportables(ArrayList<ObjetoTransportable> objetoTransportables) {
        this.objetoTransportables = objetoTransportables;
    }
}
