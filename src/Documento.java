public class Documento extends Archivo {

    public Documento(String nombre, int storage){
        super(nombre, storage);
    }

    @Override
    public int calcularEspacioOcupado(){
        return storage;
    }




}
