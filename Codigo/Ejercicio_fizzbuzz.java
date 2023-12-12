package ejercicio_fizzbuzz;
import java.util.*;
//Ejercicio de numeros fizzbuzz

public class Ejercicio_fizzbuzz {

    //Declaración de variables
    public static Ejercicio_fizzbuzz fizzbuzz = new Ejercicio_fizzbuzz(); //Declaración de objeto fizzbuzz
    public static Scanner sc = new Scanner(System.in); //Declarwción de variable Scanner
    public static int rango_inferior;
    public static int rango_superior;
    
    public void fizz_buzz(int rango_inferior, int rango_superior){
        System.out.println("Ejercicio de numeros fizz_buzz");
        System.out.print("Señor usuario por favor digite el rango inferior de la secuencia fizz_buzz: ");
        rango_inferior = sc.nextInt();
        System.out.print("Señor usuario por favor digite el rango superior de la secuencia fizz_buzz: ");
        rango_superior = sc.nextInt();
        System.out.print("\nCalculado el proceso...\n");
        
        for (int i = rango_inferior; rango_inferior <= rango_superior; rango_inferior++){
            if (rango_inferior %3 == 0 && rango_inferior %5 == 0) {
                System.out.println("fizz_buzz");
            } else if (rango_inferior %3 == 0) {
                System.out.println("fizz");
            } else if (rango_inferior %5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(rango_inferior);
            }
        }
        System.out.println("Proceso finalizado...");
    }
    
    public static void main(String[] args) {
        fizzbuzz.fizz_buzz(rango_inferior, rango_superior);
    }
    
}