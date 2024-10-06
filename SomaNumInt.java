package somanumint;
import java.util.Scanner;

public class SomaNumInt {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int a;
        int b;
        System.out.println("Digite o primeiro valor: ");
        a = s.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = s.nextInt();
        int resultado;
        resultado = a + b;
        
        System.out.println(" O resultado da soma é: " + resultado);
        
    }
    
}
