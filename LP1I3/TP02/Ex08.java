/**
  ANDREZA CB3012191
 LIDIANE CB3012026 
  
 Ex08. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
 digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
 valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
 correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
 colunas.

| a - 1,1    a - 2,1    a - 3,1|
| a - 1,2    a - 2,2    a - 3,2|
| a - 1,3    a - 2,3    a - 3,3|
| a - 1,4    a - 2,4    a - 3,4|
 
 */


import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String valores = "";
        double[][] matriz1 = new double[3][4];
        double[][] matriz2 = new double[3][4];

       //fazer um loop 
       for(int i= 0; i <3; i++)
       {
           // cria um loop em que (i+1) adiciona na matriz + 1 valor
           System.out.print("\r\ninsira o valor da ordem " + (i+1) +" da matriz: ");

           //cria um loop para inserir o valor 4 vezes
           for( int j = 0; j < 4; j++)
           {
               System.out.print("\r\nValor " + (j +1) + ": ");
               valores = scanner.next();
               matriz1[i][j] = Double.parseDouble(valores);

           }
       }
       System.out.print("Informe o valor que deseja multiplicar a matriz: ");
       valores = scanner.next();
       double x = Double.parseDouble(valores);

       for( int  i = 0; i < 3; i++)
       {
           for( int j = 0; j < 4; j++)
           {
               matriz2[i][j] = matriz1[i][j] * x;
           }
       }
       for( int i = 0; i< 3; i++)
       {
           for(int j = 0; j <4; j++)
           {
               //imprimi a matriz
               System.out.print("\r\n" + matriz2[i][j]);
           }
       }
       //fecha o scanner
       scanner.close();
   }
   
}
