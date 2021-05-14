/*
ANDREZA CB3012191
LIDIANE CB3012026 
Ex06. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
| a - nome   a - nome  |
| a - nome   a - nome  |
| a - nome   a - nome  |

*/

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        String[][] matriz = new String[2][3];
          
        //fazer um loop 
        for(int i= 0; i <2; i++)
        {
            
            System.out.println("\r\ninsira um nome para adicionar na ordem da matriz: ");

            //cria um loop para inserir o valor 3 vezes
            for( int j = 0; j < 3; j++)
            {  
                System.out.print("\r\nNome " + (j +1) + ": ");
                nome = scanner.next();
                matriz[i][j] = nome;
            }
        }
        System.out.print("\r\nA matriz 2x3 contém ");
        for( int i = 0; i< 2; i++)
        {
            for(int j = 0; j <3; j++)
            {
               //imprimi toda a matriz
                System.out.println("\r\n " + matriz[i][j]);
            }
        }
      //fecha o scanner
    scanner.close();

    }
    
}
