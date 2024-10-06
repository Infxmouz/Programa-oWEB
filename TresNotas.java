package tresnotas;

import java.util.Scanner;

public class TresNotas {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println ("Digite a primeira nota: ");
        double nota1 = s.nextDouble();
        
        System.out.println ("Digite a segunda nota: ");
        double nota2 = s.nextDouble();
        
        System.out.println ("Digite a terceira nota: ");
        double nota3 = s.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println ("A media foi de: " + media);
    
}
}
