import java.util.ArrayList;

public class MedioDeTransporte {
    private double capacidad;
    private double capacidadMaxima;
    private Dimension dimension;
    private ArrayList<ObjetoTransportable> objetoTransportables;
    private int cantidadMaxima;

    MedioDeTransporte(double capacidadMaxima, Dimension dimension,int cantidadMaxima) {
        setCapacidadMaxima(capacidadMaxima);
        setDimension(dimension);
        setCapacidad(0);
        setObjetoTransportables(new ArrayList<ObjetoTransportable>());
        setCantidadMaxima(cantidadMaxima);
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

    public void cargar(ObjetoTransportable objetoTransportable) {
        if (getObjetoTransportables().size()>=getCantidadMaxima())return;
        if (getCapacidad()+objetoTransportable.getPeso()>=getCantidadMaxima())return;
        this.setCapacidad(getCapacidad()+objetoTransportable.getPeso());
        this.objetoTransportables.add(objetoTransportable);
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }
    public String generarInventario(){
        String inventario ="";
        for (int i = 0; i <getObjetoTransportables().size() ; i++) {
            String nombre=getObjetoTransportables().get(i).getNombre();
            inventario+= nombre + "" + peso + "\n";
        }
        return inventario;
    }
}
