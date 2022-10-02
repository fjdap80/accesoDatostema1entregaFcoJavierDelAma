package main.entregafjdap.ejercicio1;
import java.util.Scanner;

public class ComplejoTest {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        //Creamos el objeto numComple1 en el que los sumaImag atributos se inicializan a 0
        Complejo numComple1 = new Complejo();

        //Creamos el objeto numComple2 en el que los sumaImag atributos se inicializan a los párametros dados: 6 y 8.
        Complejo numComple2 = new Complejo(6,8);

        System.out.print("Introduzca el número la parte real del número: ");
        double realComple1 = teclado.nextDouble();
        numComple1.cambia_Real(realComple1);

        System.out.print("Introduzca la parte imaginario del número: ");
        double realComple2 = teclado.nextDouble();
        numComple1.cambia_Imag(realComple2);        

        
        numComple1.Complejosumar(); //Llamada al metodo sumar
        numComple1.imprimir();//Llamada al método imprimir
        System.out.println(numComple1.imprimir());
        System.out.println(numComple1.toString());
    }
}