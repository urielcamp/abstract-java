import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        Documento documento = new Documento("informe", 1);
        //System.out.println("el storage de " + documento.nombre + " es de: " + documento.calcularEspacioOcupado());

        Capreta carpeta = new Capreta("informes");

        carpeta.agregarCarpeta(3);
        carpeta.agregarCarpeta(2);

        //System.out.println(carpeta.calcularEspacioOcupado());

        //Ejercicio 2

        Mago mago = new Mago("leo", 98);

        //System.out.println(mago.atacar());
        //System.out.println(mago.defender());


        //Ejercicio 3

        Cubo cubo = new Cubo(3);

        //System.out.println(cubo.calcularVolumen());

        //Ejercicio 4

        Gerente gerente = new Gerente("jero", 1900);
        System.out.println(gerente.calcularSalario());
    }
}