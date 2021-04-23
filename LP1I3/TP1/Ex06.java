
//ANDREZA CB3012191
//LIDIANE CB3012026
/*6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.*/

import java.util.Scanner;
class Ex06 {
    
    public static void main(String[] args) {
    
    double n1, n2, n3, n4, media;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a primeira nota 1: ");
    String valor = scanner.next();
    n1 = Double.parseDouble(valor);
    
    System.out.print("Digite a nota 2: ");
     valor = scanner.next();
    n2 = Double.parseDouble(valor);

    System.out.print("Digite a nota 3: ");
     valor = scanner.next();
    n3 = Double.parseDouble(valor);

    System.out.print("Digite a nota 4: ");
     valor = scanner.next();
    n4 = Double.parseDouble(valor);

    media = (n1 + n2 + n3 + n4) /4;

    System.out.println();
    System.out.println("A média de quatro valores é: " + media);
  }
}
