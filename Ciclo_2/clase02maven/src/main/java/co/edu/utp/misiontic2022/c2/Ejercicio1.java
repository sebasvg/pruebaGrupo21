package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio1 {
    //Algoritmo : Numero de la suerte
    //1. solicitar al usuraio fecha de nacimineto dd/mm/aaa en formato String
    //2. Extraer las porciones que hacen referencia al dia mes año (split)
    //3. Cada porcion convertirla en un valor numerico 
    //4. Sumar los pedazos y almacenarlos
    //5. De la sumatoria extraer las cifras
    //6. Sumar las cifras y retornar numero de la suerte

    //Generar el codigo java

    public static void saludo(){
        System.out.println("APLICACION NUMERO DE LA SUERTE");
    }

    public static String leerFecha(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar la fecha DD/MM/AAAA: ");
        String fecha = sc.nextLine();
        sc.close();
        return fecha;
    }

    public static void reportarNumeroSuerte(int numeroSuerte){
        System.out.println("El numero de la suerte es: " + numeroSuerte);
    }


    //Logica
    public static int obtenerNumeroSuerte(String fecha) {
        //Variable que contiene resultado del numero de la suerte
        int numeroSuerte = 0;

        //Extraer las porciones que hacen referencia al dia, mes y año (split)
        String [] arregloFecha = fecha.split("/", 3);

        //Variable spara las versiones numericas de las partes del año
        int datoDia = Integer.parseInt(arregloFecha[0]);//metodo que separa los valores 
        int datoMes = Integer.parseInt(arregloFecha[1]);
        int datoAnio = Integer.parseInt(arregloFecha[2]);
        
        //Salida de prueba
        /*
        System.out.println(datoDia);
        System.out.println(datoMes);
        System.out.println(datoAnio);
        */
        
        //Sumar los pedazoz y almacenarlos
        int sumaPartesFecha = datoDia + datoMes + datoAnio;
        
        //Convertir los enteros en tipo String
        String sumaPartesFechaCadena = Integer.toString(sumaPartesFecha);// este metodo es para pasar de int a strig
        //for en java se divide en 3= 1 es una variable la que voy a iterar 2. es una condicion que mientras sea verdadera se sigue ejecuatando y la 3. es el incremento
        for(int i = 0; i < sumaPartesFechaCadena.length();i++){
            numeroSuerte = numeroSuerte + Character.getNumericValue(sumaPartesFechaCadena.charAt(i)) ;//metodo para convertir un caracter en numero
        }
        return numeroSuerte;

        
    }

    public static void main(String[] args) {
        saludo();
        reportarNumeroSuerte(obtenerNumeroSuerte(leerFecha()));
        /*
        String fecha = leerFecha();
        System.out.println(obtenerNumeroSuerte(fecha));
        */


    }
    
}
