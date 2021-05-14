/*
ANDREZA CB3012191
LIDIANE CB3012026

Ex02. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.
*/


import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] valores = new double[10];
        double maior = 0;
        double soma = 0;
        double media;
        
        //incremento para digitar 10 valores
        for(int i = 0; i < 10; i++){

            do{
                System.out.print("\r\nDigite um valor positivo: ");
                String valor = scanner.next();
                valores[i] = Double.parseDouble(valor);

            }while(valores[i] < 0);
            // achar o maior valor digitado
            if( valores[i] > maior){

                maior = valores[i];

            }
            // soma de todos os valores digitados -> incremento foi usado
            soma += valores[i];
            }
            //media = soma de todos os valores digitados / 10

            media = ( soma / 10 );

        System.out.print("\r\nO maior valor é : " + maior);
        System.out.print("\r\nA soma dos valores é : " + soma);
        System.out.print("\r\nA média aritmética dos valores é : " + media);

        scanner.close();
        
    }
}
