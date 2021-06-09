/** 
Importamos la clase scanner
*/
import java.util.Scanner;
public class Ejercicio1 {
   public static void main(String[] args){

       /** 
       objeto de la clase scanner para poder leer en pantalla
       */
       Scanner scanner = new Scanner (System.in);

       /** 
       Declaracion de variables para el uso del programa, numero1, numero2 y resultado
       Usamos double para poder sumar numeros decimales
       */
       Double numero1;
       Double numero2;
       Double resultado;

       /** 
       Peticion de datos al usuario para poder asignarlos a las variables
       */
       System.out.println("Bienvenido");
       System.out.println("--------------------");
       System.out.println("Ingresa un numero");
       numero1 = scanner.nextDouble();
       System.out.println("Ingresa un numero");
       numero2 = scanner.nextDouble();

       /**
       Realizamos la suma y la mostramos en pantalla
       */
       resultado = numero1+numero2;
       System.out.println(numero1+" + "+numero2+" = "+resultado);
   }
}