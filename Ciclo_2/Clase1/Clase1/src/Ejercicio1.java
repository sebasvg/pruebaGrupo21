public class Ejercicio1 {

    public static void main(String[] args) {// Crear funcion main es para ejecutarse inetataneamente probas la funcion
        var nombre = "Bastian";
        var resultado = saludo(nombre);
        System.out.println(resultado);


    }

    public static String saludo (String nombre){//Crear funcion  String es por que necesito que me arroje una cadena de charact
        return "Hola " + nombre + " !";

    }
    
}
