package entrega_uno;

import java.util.Scanner;

public class Ejercicio_Catorce {
    public static void main(String[] args){
    double numero, cuadrado, cubo;
    Scanner input = new Scanner(System.in);
    System.out.print("Número: ");
    numero = input.nextInt();
    
    cuadrado = Math.pow(numero, 2);
    cubo = Math.pow(numero, 3);
    System.out.printf("Su valor cuadrático es:  "+ "%.0f\n",cuadrado);
    System.out.printf("Su valor cúbico es: " + "%.0f\n",cubo);
    }
    
}
