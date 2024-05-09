public class Mago extends Personaje{

    public Mago(String nombre, int nivel){
        super(nombre, nivel);
    }

    @Override
    public String atacar(){
        return nombre + " esta atacando";
    }

    @Override
    public String defender(){
        return nombre + " esta defendiendo";
    }
}
