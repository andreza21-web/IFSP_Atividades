
//ANDREZA CB3012191
//LIDIANE CB3012026
/*3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.*/

import java.util.Scanner;
class Ex03 {
 
    public static void main(String[] args) {
    
    double diagonal,area;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a diagonal do quadrado para calcular a sua área: ");
    String valor = scanner.next();
    diagonal = Double.parseDouble(valor);
    

    area =(diagonal*diagonal)/2;

    System.out.println();
    System.out.println("A area do quadrado pela sua diagonal é: " + area);
  }
}

