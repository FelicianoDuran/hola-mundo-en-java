/**
* Muestra por pantalla la frase "¡Hola mundo!"
*
* @author Feliciano Duran
*/

public class HolaMundo { // Clase principal

public static void main(String[] args) {
  
  String rojo = "\033[31m";
  String verde = "\033[32m";

  System.out.println(rojo +"¡Hola" + verde +" mundo!");

  }

}
