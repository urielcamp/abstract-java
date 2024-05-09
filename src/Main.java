import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Documento documento = new Documento("informe", 1);
        System.out.println("el storage de " + documento.nombre + " es de: " + documento.calcularEspacioOcupado());

        Capreta carpeta = new Capreta("informes");

        carpeta.agregarCarpeta(3);
        carpeta.agregarCarpeta(2);

        System.out.println(carpeta.calcularEspacioOcupado());

    }
}