
package entrega_uno;
public class Ejercicio_Cinco {
    public static void main(String[] args) {
        int suma=0, x=20, y;
        suma += x;
        y = 40;
        x += Math.pow(y,2);
        suma += x/y; 
        System.out.println("El valor de la suma es: " + suma);
    }
}
