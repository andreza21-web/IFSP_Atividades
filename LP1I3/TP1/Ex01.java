
//ANDREZA CB3012191
//LIDIANE CB3012026

/*1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.*/

import java.util.Scanner;
class Ex01 {
 
    public static void main(String[] args) {
    
    double base, altura, area;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor da base do retângulo: ");
    String valor = scanner.next();
    base = Double.parseDouble(valor);
    
    System.out.print("Digite a altura do retângulo: ");
     valor = scanner.next();
     altura = Double.parseDouble(valor);

    area = base*altura;

    System.out.println();
    System.out.println("Area do retângulo é: " + area);
  }
}
