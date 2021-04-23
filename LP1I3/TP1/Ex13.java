//ANDREZA CB3012191
//LIDIANE CB3012026

/*13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.*/

import java.util.Scanner;
class Ex13{
public static void main(String[] args) {
 
   double v_f, v_i, a, t;
 
   Scanner scanner = new Scanner(System.in);
 
   System.out.print("Digite velocidade inicial: ");
   String valor = scanner.next();
   v_i = Double.parseDouble(valor);
 
   System.out.print("Digite a aceleração do veículo: ");
   valor = scanner.next();
   a = Double.parseDouble(valor);
 
   System.out.print("Digite o tempo de percurso: ");
   valor = scanner.next();
   t = Double.parseDouble(valor);
 
   v_f = v_i + (a*t);
 
   System.out.print("A velocidade final é: " + v_f);
}
}
