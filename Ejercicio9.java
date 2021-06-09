/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer en pantalla
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Declaramos las variables -palabraA-, -palabraB- y -palabraAuxiliar-
         * Estas variables permitiran almacenar los datos ingresados por el usuario e intercambiar sus valores
         */
        String palabraA;
        String palabraB;
        String palabraAuxiliar;

        /**
         * Guardamos en las variables los datos ingresados por el usuario
         */
        System.out.println("Ingresa una palabra");
        palabraA = scanner.nextLine();
        System.out.println("Ingresa una palabra");
        palabraB = scanner.nextLine();

        /**
         * Intercambiamos los valores ingresados apoyandonos de la variable auxiliar
         */
        palabraAuxiliar = palabraB;
        palabraB = palabraA;
        palabraA = palabraAuxiliar;

        /**
         * Imprimimos en pantalla los valores intercambiados
         */
        System.out.println("La palabra A es: "+palabraA);
        System.out.println("La palabra B es: "+palabraB);
    
    }
}
