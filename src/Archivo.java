public abstract class Archivo {

    protected String nombre;
    protected int storage;

    public Archivo(String nombre, int storage){
        this.nombre = nombre;
        this.storage = storage;
    }

    public abstract int calcularEspacioOcupado();
}
