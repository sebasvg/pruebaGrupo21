import java.util.Scanner;

public class Ejercicio5 {

    /*Haga que un usuario ingrese su calificacion y utilizando una declaracion 
    swich que imprima un mensaje para informa como le fue al estudiante*/

    public static void main(String[] args) {
        //Capturar la nota
        System.out.println("Ingrese la nota: ");
        Scanner captura = new Scanner(System.in);
        String nota = captura.next();
        captura.close();
        String mensaje = "";

        switch(nota){
            case "E":
                 mensaje = "Excelente trabajo!!  la mejor nota";
                 break;

            case "S":
                mensaje = "Sobresaliente, buena nota";
                break;

            case "R":
                mensaje = "Regular, la proxima sera mejor";
                break;
            
            case "I":
                mensaje =  "Insuficiente; revisa de nuevo";
                break;                
        }

        System.out.println(mensaje);

        
    }
    
}
