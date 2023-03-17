package practica;
 
import java.util.Scanner;

public class PRACTICA {
  public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    int numeros = 0;
    
    System.out.println("Escribe un numero para hacer los calculos.");
    numeros = teclado.nextInt();
    
    System.out.println(numeros * 2);
    System.out.println(numeros * 3);
    System.out.println(Math.sqrt(numeros));
  }
    
}
