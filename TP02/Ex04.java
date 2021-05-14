/*
ANDREZA CB3012191
LIDIANE CB3012026 

Ex04.Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.
| a - 1,1    a - 2,1  |
| a - 1,2    a - 2,2  |
| a - 1,3    a - 2,3  |

*/


import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valores = "";
        double[][] matriz = new double[2][3];
          
        //fazer um loop 
        for(int i= 0; i <2; i++)
        {
            // cria um loop em que (i+1) adiciona na matriz + 1 valor
            System.out.print("\r\ninsira o valor da ordem " + (i+1) +" da matriz: ");

            //cria um loop para inserir o valor 3 vezes
            for( int j = 0; j < 3; j++)
            {
                System.out.print("\r\nValor " + (j +1) + ": ");
                valores = scanner.next();
                matriz[i][j] = Double.parseDouble(valores);

            }
        }
        for( int i = 0; i< 2; i++)
        {
            for(int j = 0; j <3; j++)
            {
                System.out.print("\r\n" + matriz[i][j]);
            }
        }
      
    scanner.close();
    }
}
