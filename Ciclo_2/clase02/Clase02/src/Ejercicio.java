import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
       
      //1.Capturar el numero de horas trabajadas.
      System.out.println("Ingrese el numero de horas trabajadas del empleado");
      Scanner sc = new Scanner(System.in);
      int horasTrabajadas = sc.nextInt();

    
      //2.Captuarar el costo de la hora del trabajador.
      System.out.println("Ingrese el costo de la hora del empleado");
      double costoHora = sc.nextDouble();
      sc.close();
      

      //3.Multiplicar las horas trabajadas pro el costo total de la hora.
      double pagoTotal = horasTrabajadas * costoHora;


      //4.Mostarar el resultado.  
      System.out.println("El pago Total del empleado es:  " + pagoTotal);      
      
    }


}
