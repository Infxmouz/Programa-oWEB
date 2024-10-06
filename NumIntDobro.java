package numintdobro;

import java.util.Scanner;

public class NumIntDobro {

    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        int dobro = numero*2;
        System.out.println(" O dobro desse número é:  " +dobro);
    }
    
}
