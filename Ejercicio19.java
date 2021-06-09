/**
 * Importar clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args){
        /**
         * Instanciando objeto de la clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Declaramos variables para almacenar datos ingresados por el usuario y calculos 
         */
        int numeroAleatorio, resto;
        
        /**
         * Creamos numero aleatorio 
         * Y lo imprimimos en pantalla
         * Calculamos el resto de su division entre 5
         */
        numeroAleatorio = (int)(Math.random()*100+1);

        System.out.println("Su numero aleatorio es: "+numeroAleatorio);
        
        resto = numeroAleatorio%5;

        /**
         * Condionales para saber si el numero es correcto o incorrecto
         */
        if(resto==0 && numeroAleatorio<=25){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");
        }

    }
}
