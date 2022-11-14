public class ObjetoTransportable {
    private String nombre;
    private double peso;
    private Dimension dimension;
    private boolean fragil;

    ObjetoTransportable(String nombre, double peso, Dimension dimension)  {
        setNombre(nombre);
        setPeso(peso);
        setDimension(dimension);
    }

    ObjetoTransportable(String nombre, double peso, Dimension dimension, boolean fragil)  {
        setNombre(nombre);
        setPeso(peso);
        setDimension(dimension);
        setFragil(fragil);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }
}
