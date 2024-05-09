import java.util.LinkedList;

public class Capreta extends Archivo {

    protected LinkedList<Integer> listArchivos = new LinkedList<Integer>();

    public Capreta(String nombre){
        super(nombre, 0);
        listArchivos = new LinkedList<>();
    }

    public void agregarCarpeta(int carpeta){
        listArchivos.add(carpeta);

    }

    @Override
    public int calcularEspacioOcupado(){

        for(Integer a: listArchivos){
            storage += a;


        }
        return storage;
    }




}
