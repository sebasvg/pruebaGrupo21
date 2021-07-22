import java.util.Scanner;


public class Ejercicio3 {
    /* Todos los vendedores reciben un pago de $1000 dolares a la semana, 
    los vendedores que exedan las 10 ventas recibiran un pago adicional de $250*/

    public static void main(String[] args) {
        //Inicializar las variables.
        int salario = 10000;
        int pagoAdicional = 250;
        int ventasAdicional = 10;

        //Tomar los valores desconocidos
        System.out.println("Cuales son las ventas de la semana? ");;
        var capturador = new Scanner(System.in); //Scanner capturador = new Scanner(System.in);
        var ventas = capturador.nextInt();

        capturador.close();
        


        //Camino logico diferente para los ganadorers del bono

        if(ventas > ventasAdicional){
            salario = salario + pagoAdicional;
        }

        //Imprimir el salario
        System.out.println("El salario final en la smena es " + salario);




    }
    
}
