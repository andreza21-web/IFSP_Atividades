//ANDREZA CB3012191
//LIDIANE CB3012026
/* 17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
*/

import java.util.Scanner;
class Ex17 {
    
    public static void main(String[] args) {
    
    double x, y;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o valor de x:  ");
    String valor = scanner.next();
    x = Double.parseDouble(valor);
    
    System.out.print("Informe o valor de y:  ");
     valor = scanner.next();
    y = Double.parseDouble(valor);

    System.out.println();
    System.out.println("X elevado a Y é : " +  Math.pow(x, y));
     
  }
}
