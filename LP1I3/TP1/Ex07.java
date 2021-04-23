//ANDREZA CB3012191
//LIDIANE CB3012026
/*7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.*/

import java.util.Scanner;
class Ex07 {
    
    public static void main(String[] args) {
    
    double n1, n2, media, x;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a primeira nota 1: ");
    String valor = scanner.next();
    n1 = Double.parseDouble(valor);
    
    System.out.print("Digite a nota 2: ");
     valor = scanner.next();
    n2 = Double.parseDouble(valor);
    
    x = n1 *n2;
   media = Math.sqrt(x);

    System.out.println();
    System.out.println("A média geométrica dos valores digitados é: " + media);
  }
}
