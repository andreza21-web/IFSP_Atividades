
//ANDREZA CB3012191
//LIDIANE CB3012026
/* 16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.*/

import java.util.Scanner;
class Ex16 {
    
    public static void main(String[] args) {
    
    double graus,a;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o em graus o ângulo para exibir as funções trigonométricas: ");
    String valor = scanner.next();
    graus = Double.parseDouble(valor);
    
    a = graus *( Math.PI/180);
   

    System.out.println();
    System.out.println("O angulo de " + graus + " em seno é "+ Math.sin(a));
     System.out.println("O angulo de" + graus + " em cosseno é "+ Math.cos(a));
      System.out.println("O angulo de " + graus + " em tangente é "+ Math.tan(a));
       System.out.println("O angulo de " + graus + " em secante é "+ (1 / Math.cos(a)));
   
  }
}
