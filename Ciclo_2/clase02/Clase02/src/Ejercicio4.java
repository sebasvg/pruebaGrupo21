
/*Para aplicar a un prestamo una persona debe ganar almenos 30.000 al año, 
y esta trabajando concurrentemente  en el trabajo actual por lo menos dos años */
 
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        //Inicializar las variables que conocemos

        int salarioRequerido = 30000;
        int añosRequeridosEmpleo = 2;


        //Capturar los valores desconocidos

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el salario: ");
        double salario = sc.nextDouble();

        System.out.println("Ingrese los años que ha estado en su trabajo actual " );
        double años = sc.nextDouble();
        sc.close();


        if(salario >= salarioRequerido){
            if (años > añosRequeridosEmpleo){
                System.out.println("Felicitaciones, su prestamo a sido aprovado");

            }else {
                System.out.println("El tiempo trabajado no es el suficiente: (");
            
            }
        }else{
            System.out.println("Lo sentimos su salario debe ser de al menos " + salarioRequerido + ":/");

        }

    }
    
    
}
