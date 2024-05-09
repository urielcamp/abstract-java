public abstract class Empleado {

    protected String nombre;
    protected int salarioBase;
    public  Empleado (String nombre, int salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;

    }

    public abstract int calcularSalario();

}
