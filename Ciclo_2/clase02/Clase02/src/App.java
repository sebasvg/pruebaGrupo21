import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");
        String nombre = sc.nextLine(); //*me permite ingresar un valor por teclado como el input en pytho
        sc.close();
        System.out.println("Buenas tardes "+ nombre + "!!");

    }   //*este me permite imprimir en consola.
}


