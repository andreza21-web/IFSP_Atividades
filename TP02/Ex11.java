
/*
  ANDREZA CB3012191
 LIDIANE CB3012026

 Ex11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir determinante da matriz.
 */


import java.util.Scanner;
public class Ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valores = "";
        int linha, coluna;

        do{
            System.out.print("Digite o numero de linhas da matriz (máximo 10) :");
            valores = scanner.next();
            linha = Integer.parseInt(valores);
        } while( linha > 10 || linha < 0);

        do{
            System.out.print("Digite o numero de colunas da matriz (máximo 10) :");
            valores = scanner.next();
            coluna = Integer.parseInt(valores);
        } while( coluna > 10 || coluna < 0 );

        double[][] matriz = new double[linha][coluna];
       
        //fazer um loop 
        for(int i= 0; i <linha; i++)
        {
            // cria um loop em que (i+1) adiciona na matriz + 1 valor
            System.out.print("\r\ninsira o valor da ordem " + (i+1) +" da matriz: ");

            //cria um loop para inserir o valor 
            for( int j = 0; j < coluna; j++)
            {
                System.out.print("\r\nValor " + (j +1) + ": ");
                valores = scanner.next();
                matriz[i][j] = Double.parseDouble(valores);

            }
        }
        System.out.print("A matriz contém : ");
       
        for( int  i = 0; i < linha; i++)
        {
            for( int j = 0; j < coluna; j++)
            {
                System.out.println("\r\n " + matriz[i][j]);
            }
        }
        
        //fecha o scanner
        scanner.close();
    }
    
}
