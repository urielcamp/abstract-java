public class Cubo extends Figuras3D {
    protected int lado;

    public Cubo (int lado){
        this.lado = lado;
    }

    @Override
    public int calcularVolumen(){
        return lado * lado * lado;
    }



}
