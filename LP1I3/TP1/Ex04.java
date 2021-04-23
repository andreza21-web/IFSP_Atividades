//ANDREZA CB3012191
//LIDIANE CB3012026
/*4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.*/

import java.util.Scanner;
class Ex04 {
    
    public static void main(String[] args) {
    
    double base, altura, area;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a base do triângulo: ");
    String valor = scanner.next();
    base = Double.parseDouble(valor);
    
    System.out.print("Digite a altura do triângulo: ");
     valor = scanner.next();
    altura = Double.parseDouble(valor);

    area =(base*altura)/2;

    System.out.println();
    System.out.println("A area do triângulo é: " + area);
  }
}
