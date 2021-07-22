import java.util.Scanner;

public class Ejercicio2 {
    
    /*  Cree un programa que le pregunte al usuario por una estacion del año,
        luego un numero entero y un adjetivo y usala para completar la oracion.
        En un dia {adjetivo} de {EstacionDelAño}, yo bebo un minimo de {numeroEntero} tazas de cafe*/


        
         public static void main(String[] args) {
        
            //Preuntar por la estacion del año
            System.out.println("Ingrese la estacion del año: "); //en Java 8 se puede asi asi:
            Scanner sc = new Scanner(System.in);                //var sc = new Scanner(System.in);
            String estacion = sc.next();                        //var estacion = sc.next(); 

            //Preguntar por el numero entero
            System.out.println("Ingrese el numero entero: ");
            int numero = sc.nextInt();

            //Preguntar por un adjetivo
            System.out.println("Ingrese un adjetivo");
            String adjetivo = sc.next();
            sc.close();

            //Completar l oracion.
            String oracion = "En un dia " + adjetivo + " de " + estacion + ", yo bebo un minimo de " + numero + " tazas de cafe";
            System.out.println();
            System.out.println(oracion);

        }

    
}
