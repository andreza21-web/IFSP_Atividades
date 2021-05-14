/*
ANDREZA CB3012191
LIDIANE CB3012026 

Ex03. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o
programa em função dessa resposta.

*/

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        // inserir as variaveis
        Scanner scanner = new Scanner(System.in);
        String valor;
        double porcentagemPositivo;
        double porcentagemNegativo;
do{


        double maiorValor = 0;
        double menorValor = 0;
        double soma = 0;
        double positivo = 0;
        double negativo = 0;
        double media;
        int n;
       
        //inserir e guardar o valor para o loop

        do{
            System.out.print("Digite quantos valores serão digitados, sabendo que deverá ser menor que 20 :");
             valor = scanner.next();
            n = Integer.parseInt(valor);

            // loop valor determina ate o 20 para iniciar o sistema
        }while( n >20 || n < 0);

        double[] qtNumero = new double[n];

        System.out.print("Digite o valor: ");

        //loop guarda o valor 
        //qtNumero.length -> tamanho do array 
        for( int i =0; i < qtNumero.length; i++)
        {
            System.out.print("\r\nvalor " + (i +1) + ": ");
            valor = scanner.next();
            qtNumero[i] = Double.parseDouble(valor);
            soma += qtNumero[i];

        }

        for( int i =0; i < qtNumero.length; i++) 
        {
            if( qtNumero[i] >= 0)
            {
                positivo++;
            }
            else{
                negativo++;
            }
            if(qtNumero[i] > maiorValor);
            {
                maiorValor = qtNumero[i];
            }
             if( qtNumero[i] < menorValor);
            {
                menorValor = qtNumero[i];
            }
        }

        media = (soma / qtNumero.length);
        porcentagemNegativo = (negativo / qtNumero.length) * 100;
        porcentagemPositivo = (positivo / qtNumero.length) * 100;


    System.out.print("\r\nO maior valor: " + maiorValor);
    System.out.print("\r\nO menor valor:  " + menorValor);
    System.out.print("\r\nA soma dos valores: " + soma);
    System.out.print("\r\nA média aritmética dos valores: " + media);
    System.out.print("\r\nA porcentagem de valores que são positivos: " + porcentagemPositivo);
    System.out.print("\r\nA porcentagem de valores que são negativos: " + porcentagemNegativo);
    System.out.print("\r\n");

    System.out.print("\r\nDeseja encerrar o sistema ? S ou N: ");
    valor = scanner.next();

    }while(valor == "N");
    
    {
        double maiorValor = 0;
        double menorValor = 0;
        double soma = 0;
        double positivo = 0;
        double negativo = 0;
        double media;
        int n;
       

        do{
            System.out.print("Digite quantos valores serão digitados, sabendo que deverá ser menor que 20 :");
             valor = scanner.next();
            n = Integer.parseInt(valor);

        }while( n >20 || n < 0);

        double[] qtNumero = new double[n];

        System.out.print("Digite o valor: ");

        for( int i =0; i < qtNumero.length; i++)
        {
            System.out.print("\r\nvalor " + (i +1) + ": ");
            valor = scanner.next();
            qtNumero[i] = Double.parseDouble(valor);
            soma += qtNumero[i];

        }

       
        for( int i =0; i < qtNumero.length; i++) 
        {
            if( qtNumero[i] >= 0)
            {
                positivo++;
            }
            else{
                negativo++;
            }
            if(qtNumero[i] > maiorValor);
            {
                maiorValor = qtNumero[i];
            }
            if( qtNumero[i] < menorValor);
            {
                menorValor = qtNumero[i];
            }
        }

        media = (soma / qtNumero.length);
        porcentagemNegativo = (negativo / qtNumero.length) * 100;
        porcentagemPositivo = (positivo / qtNumero.length) * 100;


    System.out.print("\r\nO maior valor: " + maiorValor);
    System.out.print("\r\nO menor valor:  " + menorValor);
    System.out.print("\r\nA soma dos valores: " + soma);
    System.out.print("\r\nA média aritmética dos valores: " + media);
    System.out.print("\r\nA porcentagem de valores que são positivos: " + porcentagemPositivo);
    System.out.print("\r\nA porcentagem de valores que são negativos: " + porcentagemNegativo);
    System.out.print("\r\n");
    
    }
             
        scanner.close();
    }
}
