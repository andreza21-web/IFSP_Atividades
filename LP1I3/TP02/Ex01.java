/*ANDREZA CB3012191
//LIDIANE CB3012026 

Ex01. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor.
*/

import java.util.Scanner;


class Ex01 {
     public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        double v1, v2; 

        System.out.print("Digite o primeiro valor:");
        String valor = scanner.next();
        v1 = Double.parseDouble(valor);
         //passara desta parte se o segundo valor for maior que o primeiro
        do{

            System.out.print("Digite o valor maior que o primeiro:");
            valor = scanner.next();
            v2 = Double.parseDouble(valor);

        }
        while (v1 >= v2);

        System.out.print("O segundo valor e maior que o primeiro!");
        
        scanner.close();
    }
}