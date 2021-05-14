/*
  ANDREZA CB3012191
 LIDIANE CB3012026

 Ex09. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.

*/



import java.util.Scanner;

public class Ex09 {
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
        double[][] transposta = new double[coluna][linha];

        for(int i= 0; i <linha; i++)
        {
            // cria um loop em que (i+1) adiciona na matriz + 1 valor
            System.out.print("\r\ninsira o valor da ordem " + (i+1) +" da matriz: ");

            //cria um loop para inserir o valor da matriz
            for( int j = 0; j < coluna; j++)
            {
                System.out.print("\r\nValor " + (j +1) + ": ");
                valores = scanner.next();
                matriz[i][j] = Double.parseDouble(valores);

            }
        }

        // recebe a matriz  transposta
        for( int i = 0; i <coluna; i++) 
        {
            for( int j = 0; j < linha;  j++)
            {
                transposta[i][j] = matriz[j][i];
            }
        }
        for( int i = 0; i <coluna; i++) 
        {
            for( int j = 0; j < linha;  j++)
            {
                System.out.print("\t" + transposta[i][j]);
            }
        }

        scanner.close();
    }
}
