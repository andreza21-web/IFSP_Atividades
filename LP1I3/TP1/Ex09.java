//ANDREZA CB3012191
//LIDIANE CB3012026
/*9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.*/

import java.util.Scanner;
class Ex09 {
    
    public static void main(String[] args) {
    
    double tensao, resistencia, eletrica;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a resistencia de um circuito eletronico: ");
    String valor = scanner.next();
    resistencia = Double.parseDouble(valor);
    
    System.out.print("Digite o valor da corrente eletrica: ");
     valor = scanner.next();
    eletrica = Double.parseDouble(valor);
    
    tensao = resistencia / eletrica;

    System.out.println();
    System.out.println("A tensão de um determinado dispositivo é: " + tensao);
  }
}

