package entrega_uno;

import java.util.Scanner;

public class Ejercicio_Diecisiete {
    public static void main(String[] args) {
     double radio, area, longitud;
     Scanner input = new Scanner(System.in);
     System.out.print("Radio: ");
     radio = input.nextInt();
     area = Math.PI*Math.pow(radio,2);
     longitud = 2*Math.PI*radio;
     System.out.println("El área del circulo es: " + area);
     System.out.println("La longitud del circulo es: " + longitud);
      
    }
    
}
