
//ANDREZA CB3012191
//LIDIANE CB3012026
/*10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.*/

import java.util.Scanner;
class Ex10 {
   public static void main(String[] args) {
  
   double temperatura_c, temperatura_f;
  
   Scanner scanner = new Scanner(System.in);
 
   System.out.print("Digite a temperatura em Celsius: ");
   String valor = scanner.next();
   temperatura_c = Double.parseDouble(valor);
 
   temperatura_f = (temperatura_c * 9/5) + 32;
  
   System.out.print("A temperatura de Celsius para Fahrenheité: "+temperatura_f);
 }
}
