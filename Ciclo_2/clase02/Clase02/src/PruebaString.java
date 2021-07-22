/*  Java el String es un metodo tipado pero con una clase en la cual pued variar 
y adaptarse a lo que se requiere de diferentes modos de String:
Metodo .length() es el que se utiliza cunado se requiere la longitud de algo y cuente cuantos caracteres hay.
Metodo .indexOf("escribe lo que uno requiere que le busque y diga el numero de posicion que se encuentra").
Metodo .lastIndexOf("ubica el numero del ultimo letra que necesito que ubique") 
Metodo .charAt(# se le asigna y el ubica la letra que corresponde al numero de ubicacion que sele asigne)
Metodo .substring(8,18)) se le asignan dos valores para que me halle la palabra que esta en esa ubicacion
Metodo .equals("Es para comparar una varible con otra y arroja si es true o false si es o no la misma"));
Metodo .equalsIgnoreCase("hola")); busaca que sea la misma e ignora si esta escrita con minusculas o mays
        */
public class PruebaString {

    public static void main(String[] args) {
        String cadena = "Esto es una cadena";
        String cadena2 = "HOLA";
        String cadena3 = "     Hola1234     ";
        System.out.println("la longitud de " + cadena + " es " + cadena.length());                  
        System.out.println("La posicion de la primera u es " + cadena.indexOf("cadena"));
        System.out.println("La posicion de la ultima a es " + cadena.lastIndexOf("a"));
        System.out.println("El elemento n de la cadena " + cadena.charAt(8));
        System.out.println("Las ultimas dos palabras " + cadena.substring(8,18));
        System.out.println("Comparacion de cadenas " + cadena.equals("Esto es una cadena"));
        System.out.println("Comparacion de cadenas " + cadena2.equals("hola"));//En este ejemplo el equal es para saber si son iguales y lo son pero en minuscula
        System.out.println("Comparacion de cadenas " + cadena2.equalsIgnoreCase("hola"));
        System.out.println("Utilizacion de trin " + cadena3.trim());//Metodo que nos permite eliminar espacios 
        
        
        //EJEMPLOS CLASE MATH, no me funciono esta funcion math.
        /*
        double x = Math.abs(-2.5);
        System.out.println(x);

        double potencia = Math.pow(5,2);
        System.out.println(potencia);

        double z = Math.floor(2,5); //el entero menor con floor
        System.out.println(z);



        */


 
 


       

    }
    
}
