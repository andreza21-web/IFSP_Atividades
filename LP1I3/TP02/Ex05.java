/*
ANDREZA CB3012191
LIDIANE CB3012026 

Ex05. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
| a - 1,1    a - 2,1    a - 3,1|
| a - 1,2    a - 2,2    a - 3,2|

 */


import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valores = "";
        double[][] matriz = new double[3][2];
        
        //fazer um loop 
        for(int i= 0; i <3; i++)
        {
            // cria um loop em que (i+1) adiciona na matriz + 1 valor
            System.out.print("\r\ninsira o valor da ordem " + (i+1) +" da matriz: ");

            //cria um loop para inserir o valor 2 vezes
            for( int j = 0; j < 2; j++)
            {
                System.out.print("\r\nValor " + (j +1) + ": ");
                valores = scanner.next();
                matriz[i][j] = Double.parseDouble(valores);

            }
        }
        for( int i = 0; i< 3; i++)
        {
            for(int j = 0; j <2; j++)
            {
                //imprimi toda a matriz
                System.out.print("\r\n" + matriz[i][j]);
            }
        }

        scanner.close();
    }
    
}
