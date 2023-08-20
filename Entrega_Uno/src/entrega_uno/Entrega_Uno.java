package entrega_uno;

import java.util.Scanner;

public class Entrega_Uno {

    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.print("Edad de Juan: ");
        edad = input.nextInt();
        
        int alberto = (edad*2)/3;
        int ana = (edad*4)/3;
        int madre = edad + ana + alberto; 
        System.out.println("La edad de Juan es: "+edad);
        System.out.println("Edad de Alberto: "+alberto);
        System.out.println("Edad de Ana: "+ana);
        System.out.println("Edad de Madre: "+madre);
        
    }
    
}
