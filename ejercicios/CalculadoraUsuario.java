package ejercicios;

import java.util.Scanner;

public class CalculadoraUsuario {
    public static void main(String[] args) {
        Integer a, b, resultado;
        char Operacion;
        Scanner calculo = new Scanner(System.in);
        System.out.println("Inicio Calculadora");

        System.out.println("Inserte un número: ");
        a = calculo.nextInt();

        System.out.println("Inserte otro número: ");
        b = calculo.nextInt();

        System.out.println("Inserte operación a realizar: ");
        System.out.println("a. Suma");
        System.out.println("b. Resta");
        System.out.println("c. División");
        System.out.println("d. Multiplicación");
        System.out.println("e. Potencia");
        System.out.println("f. Resto división");
        Operacion = calculo.next().charAt(0);

        switch (Operacion) {
            case 'a':
                resultado = a+b;
                System.out.println("El resultado es: " + resultado);
                break;

            case 'b':
                resultado = a-b;
                System.out.println("El resultado es: " + resultado);
                break;

            case 'c':
                resultado=a/b;
                System.out.println("El resultado es: " + resultado);
                break;
            case 'd':
                resultado=a*b;
                System.out.println("El resultado es: " + resultado);
                break;
            case 'e':
                resultado=(int)Math.pow(a,b);
                System.out.println("El resultado es: " + resultado);
                break;
            case 'f':
                resultado=a%b;
                System.out.println("El resultado es: " + resultado);
                break;
            default:
                System.out.println("Introduce una operación permitida por el sistema");
                break;
        }
    }
}
