public class Gerente extends Empleado{

    public Gerente(String nombre, int salarioBase){
        super(nombre,salarioBase);
    }

    @Override
    public int calcularSalario(){
        return salarioBase;
    }
}
