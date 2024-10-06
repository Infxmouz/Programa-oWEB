package somatrêsint;
import java.util.Scanner;

public class SomaTrêsInt {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int a, b, c, total;
        System.out.println("Digite o primeiro valor:");
        a = s.nextInt();
        System.out.println("Digite o segundo valor:");
        b = s.nextInt();
        System.out.println("Digite o terceiro valor:");
        c = s.nextInt();
        total = a + b + c;
        System.out.println("O valor total é: " + total);
        total = s.nextInt();
        
    }    
}
